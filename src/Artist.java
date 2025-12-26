public class Artist{
    private String name;
    private String country;
    private int year_of_birth;

    public Artist(String name, String country, int year_of_birth)
    {
        this.name = name;
        this.country = country;
        this.year_of_birth = year_of_birth;
    }

    public void AlterName(String name) {
        this.name = name;
    }

    public void AlterCountry(String country) {
        this.country = country;
    }

    public void AlterYearOfBirth(int yearOfBirth) {
        this.year_of_birth = year_of_birth;
    }

    public String GetName()
    {
        return name;
    }

    public String GetCountry()
    {
        return country;
    }

    public int GetYearOfBirth()
    {
        return year_of_birth;
    }

    public void getArtistInfo(){
        System.out.println("Artist: " + name +  ", Country: " + country + ", Year of birth: " + year_of_birth );
    }
}