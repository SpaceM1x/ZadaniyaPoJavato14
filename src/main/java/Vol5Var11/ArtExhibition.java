package Vol5Var11;

import java.util.ArrayList;
import java.util.List;

public class ArtExhibition {
    private List<Exhibit> exhibits;

    public ArtExhibition() {
        this.exhibits = new ArrayList<>();
    }

    public void addExhibit(String paintingName, String author, String exhibitionDate) {
        exhibits.add(new Exhibit(paintingName, author, exhibitionDate));
    }

    // Метод для отображения всей информации о выставках
    public void showExhibits() {
        if (exhibits.isEmpty()) {
            System.out.println("Нет информации о выставках.");
        } else {
            for (Exhibit exhibit : exhibits) {
                System.out.println(exhibit);
            }
        }
    }

    // Внутренний класс Exhibit
    private class Exhibit {
        private String paintingName; // Название картины
        private String author;       // Автор картины
        private String exhibitionDate; // Дата проведения выставки

        public Exhibit(String paintingName, String author, String exhibitionDate) {
            this.paintingName = paintingName;
            this.author = author;
            this.exhibitionDate = exhibitionDate;
        }

        // Переопределение метода toString для красивого вывода
        @Override
        public String toString() {
            return "Картина: \"" + paintingName + "\", Автор: " + author + ", Дата выставки: " + exhibitionDate;
        }
    }
}