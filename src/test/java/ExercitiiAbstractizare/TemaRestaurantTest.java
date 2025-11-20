package ExercitiiAbstractizare;

import org.testng.annotations.Test;

public class TemaRestaurantTest {

    @Test
    public void testRestaurants() {

        // 1. Restaurant Vegan
        RestaurantVegan vegan = new RestaurantVegan(
                "GreenLeaf",
                "Strada Florilor 10",
                4.8,
                true,
                "tofu grill, hummus, burger vegan",
                "salată, paste vegane, supă miso",
                "Meniu Vegan Standard"
        );

        System.out.println("\n=== TEST: RESTAURANT VEGAN ===");
        vegan.infoRestaurant();
        vegan.servesteMancareVegana();
        vegan.meniuVegan();

        // 2. Restaurant Non-Vegan
        RestaurantNonVegan nonVegan = new RestaurantNonVegan(
                "Carne & Jar",
                "Bulevardul Republicii 88",
                4.6,
                true,
                "steak, burger, pui BBQ",
                "ciorbă, carne la grătar, deserturi",
                "Meniu Grill House"
        );

        System.out.println("\n=== TEST: RESTAURANT NON-VEGAN ===");
        nonVegan.infoRestaurant();
        nonVegan.servesteMancareNonVegana();
        nonVegan.meniuNonVegan();

        // 3. Restaurant Mixt
        RestaurantMixt mixt = new RestaurantMixt(
                "Fusion Bistro",
                "Strada Libertății 5",
                4.9,
                true,
                "vegan + grill",
                "burger vegan, salată, steak, pui BBQ",
                "Meniu Fusion"
        );

        System.out.println("\n=== TEST: RESTAURANT MIXT ===");
        mixt.infoRestaurant();
        mixt.servesteMancareVegana();
        mixt.meniuVegan();
        mixt.servesteMancareNonVegana();
        mixt.meniuNonVegan();
    }
}