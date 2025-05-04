package controller;

import integration.InventorySystem;
import integration.AccountingSystem;
import integration.Printer;
import integration.ItemRegistry;
import model.Sale;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {

    @Test
    public void testStartSaleCreatesSaleObject() {
        Controller controller = new Controller(
            new InventorySystem(),
            new AccountingSystem(),
            new Printer(),
            new ItemRegistry()
        );

        controller.startSale();

        // Antag att Controller har en metod för att kontrollera om sale är initierad
        Sale sale = controller.getCurrentSale();  // Om denna inte finns, skapa en get-metod för teständamål

        assertNotNull(sale, "Controller should create a Sale object when startSale is called.");
    }
}
