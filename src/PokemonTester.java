public class PokemonTester extends ConsoleProgram
{
    PokemonImages images = new PokemonImages();

    public void run()
    {
        // Using the PokemonImages class:

        // Get an image by String name
        String pikachuImage = images.getPokemonImage("Pikachu");
        System.out.println("Pikachu:\n" + pikachuImage);

        // Get an image by Pokemon
        Pokemon charmander = new Pokemon("Charmander");
        String charmanderImage = images.getPokemonImage(charmander);
        System.out.println("Charmander:\n" + charmanderImage);

        // Some Pokemon don't have images, `nothingImage` will be null
        String nothingImage = images.getPokemonImage("nothing");
        System.out.println("Nothing:\n" + nothingImage);

        // Test out your Pokemon class here!


    }
}

