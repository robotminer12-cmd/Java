public class hillstations {
    void location() {
        System.out.println("Location is;");
    }

    void famousfor() {
        System.out.println("Famous for:");
    }
}

class Darjeeling extends hillstations {
    void location() {
        System.out.println("Darjeeling is in West Bengal");
    }

    void famousfor() {
        System.out.println(
                "Darjeeling, often called the Queen of the Hills,is one of Indias most picturesque hill stations");
    }

}

class Musoorie extends hillstations {
    void location() {
        System.out.println("Musoorie is in Uttarakhad");
    }

    void famousfor() {
        System.out.println(
                "Mussoorie, the  is famous for its stunning Himalayan views, lush green hills, waterfalls (like Kempty Falls), cool climate, and charming colonial vibe");
    }
}

class Main {
    public static void main(String[] args) {
        hillstations A = new hillstations();
        hillstations D = new Darjeeling();
        hillstations M = new Musoorie();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        D.location();
        D.famousfor();
    }
}
