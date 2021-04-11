public class Main {
    public static Movie[] getMovies() {
        return new Movie[] {
                new Movie("Начало", 2010, 16),
                new Movie("Зеленая миля", 1999, 16),
                new Movie("Интерстеллар", 2014, 12),
        };
    }
    public static Theatre[] getTheatres() {
        return new Theatre[] {
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Вальпургиева ночь", 1989, 16)
        };
    }

    public static void validEvent(Event event) throws RuntimeException {
        if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle() == null || event.getAge() < 0 || event.getReleaseYear() < 1750 || event.getTitle().length() < 2) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
            System.out.println(event.toString());
        }
        for (Event event: getTheatres()) {
            validEvent(event);
            System.out.println(event.toString());
        }
        System.out.println("Все события корректны");
    }
}