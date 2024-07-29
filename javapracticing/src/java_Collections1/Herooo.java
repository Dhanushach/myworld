package java_Collections1;

// Define the Hero class
class Hero implements Comparable<Hero> {
    private String name;
    private int rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int compareTo(Hero other) {
        // Compare by rating (descending order)
        return Integer.compare(other.rating, this.rating);
    }

    @Override
    public String toString() {
        return "Hero{name='" + name + "', rating=" + rating + "}";
    }
}
