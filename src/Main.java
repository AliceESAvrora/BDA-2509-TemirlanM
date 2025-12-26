public static void main(String[] args) {

    Artist artist1 = new Artist("Lion Fox","UK",1991);
    Artist artist2 = new Artist("Bonjour Boguette","France",1988);
    ArtGallery gallery1 = new ArtGallery("London Art Gallery","London");
    Artwork artwork1 = new Artwork("Fire in hole",2016,4500,artist1);
    Artwork artwork2 = new Artwork("Push mid",2017,690,artist1);
    Artwork artwork3 = new Artwork("I LOVE Paris",2020,1020,artist2);

    artwork1.getArtworkInfo();
    artwork2.getArtworkInfo();
    artwork3.getArtworkInfo();
    artist1.getArtistInfo();
    artist2.getArtistInfo();
    gallery1.getGalleryInfo();
}