package com.learn.pact.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class InventoryController {
    @GetMapping("/inventory")
    public Inventory getInventory() {
        Inventory inventory = new Inventory(Arrays.asList(
                new Item("ITEM_ID_1", "ITEM_NAME_1", "200", "100"),
                new Item("ITEM_ID_2", "ITEM_NAME_2", "50", "0"),
                new Item("ITEM_ID_3", "ITEM_NAME_3", "600", "500"))
        );
        return inventory;
    }
}
