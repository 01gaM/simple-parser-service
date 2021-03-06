package com.wine.to.up.simple.parser.service.SimpleParser;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.FileWriter;
import java.io.IOException;

@Data
@AllArgsConstructor
public class ShopCatalog {

    private int wineID;
    private int wineShopID;
    private int shopID;
    private int price;
    private WineShop newShop;

    public void writeToFile(String filePath, ShopCatalog shopCatalog) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(this.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

