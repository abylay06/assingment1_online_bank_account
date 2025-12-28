public class InvestmentBank extends Bank {
    private double rating;

    public InvestmentBank(String name, boolean isActive, double rating) {
        super(name, isActive);
        this.rating = rating;
    }

    public double getRating() { return rating;}

    public void setRating(double rating) {this.rating = rating;}

    @Override
    public String toString() {return("Name: " + this.getName() + ", rating: " + rating);}


}
