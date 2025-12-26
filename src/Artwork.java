public class Artwork{
    private String name;
    private int year;
    private double price;
    private Artist artist;

    public Artwork(String name, int year, double price, Artist artist)
    {
        this.name = name;
        this.year = year;
        this.price = price;
        this.artist = artist;
    }

    public void AlterName(String name) {
        this.name = name;
    }
    public void AlterYear(int year) {
        this.year = year;
    }
    public void AlterPrice(double price) {
        this.price = price;
    }
    public void AlterArtist(int yearOfBirth) {
        this.artist = artist;
    }

    public String GetName()
    {
        return name;
    }

    public int GetYear()
    {
        return year;
    }

    public double GetPrice()
    {
        return price;
    }

    public Artist GetArtist()
    {
        return artist;
    }

    public void getArtworkInfo() {
        System.out.println("Artwork: " + name + ", Year: " + year + ", Price: $" + price);
        System.out.println("Artist: " + artist.GetName());
    }


}
