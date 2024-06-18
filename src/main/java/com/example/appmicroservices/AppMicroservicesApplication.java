package com.example.appmicroservices;
import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppMicroservicesApplication.class, args);
        String[] lines = {
        // Ваши строки здесь
                "29521963",
                "28360703",
                "29521948",
                "39002009",
                "29521948",
                "29521952",
                "29521952",
                "29521952",
                "25979770",
                "29521952",
                "25979770",
                "29521948",
                "25979770",
                "25979753",
                "29521948",
                "29521948",
                "29521948",
                "29521906",
                "29521948",
                "29521948",
                "29521952",
                "25979770",
                "29521948",
                "29521948",
                "29521948",
                "25979770",
                "29521940",
                "29521952",
                "29521952",
                "29521952",
                "29521948",
                "25979753",
                "29521948",
                "29521963",
                "29521940",
                "29521906",
                "29521948",
                "29521948",
                "29521948",
                "29521948",
                "29521948",
                "29521947",
                "29521947",
                "29521948",
                "28360706",
                "28360706",
                "29521906",
                "28360706",
                "28360706",
                "28360706",
                "29521947",
                "29521948",
                "29521947",
                "29521948",
                "29521947",
                "29521948",
                "29521948",
                "29521952",
                "29521947",
                "29521948",
                "29521952",
                "29521952",
                "25979770",
                "29521952",
                "29521947",
                "29521952",
                "29521947",
                "29521911",
                "29521952",
                "29521947",
                "29521947",
                "29521947",
                "29521947",
                "29521948",
                "29521947",
                "25979770",
                "29521952",
                "29521903",
                "29521947",
                "29521947",
                "29521952",
                "29521947",
                "29521947",
                "29521906",
                "29521923",
                "29521923",
                "29521923",
                "29521923",
                "29521923",
                "29521923",
                "28360705",
                "29521952",
                "29521947",
                "28360705",
                "29521952",
                "29521906",
                "29521947",
                "29521905",
                "29521947",
                "28360705",
                "29521947",
                "29521952",
                "29521948",
                "28360705",
                "28360705",
                "29521947",
                "29521947",
                "29521947",
                "29521905",
                "29521947",
                "29521947",
                "29521947",
                "29521952",
                "29521923",
                "39002009",
                "28360706",
                "29521923",
                "29521923",
                "28360704",
                "25979739",
                "29521906",
                "29521923",
                "29521923",
                "39002009",
                "29521963",
                "39002009",
                "29521903",
                "39002009",
                "29521923",
                "29521923",
                "29521963",
                "39002009",
                "39002009",
                "29521903",
                "28360703",
                "29521923",
                "29521923",
                "29521947",
                "29521947",
                "29521911",
                "29521952",
                "29521952",
                "29521963",
                "29521947",
                "29521952",
                "29521952",
                "29521905",
                "29521952",
                "29521947",
                "29521963",
                "28360706",
                "29521940",
                "29521963",
                "29521940",
                "29521963",
                "29521963",
                "29521963",
                "28360703",
                "29521963",
                "29521923",
                "29521963",
                "28360703",
                "28360703",
                "29521963",
                "29521963",
                "29521940",
                "29521940",
                "29521940",
                "29521963",
                "28360703",
                "29521948",
                "29521940",
                "25979739",
                "29521963",
                "29521963",
                "28360703",
                "29521963",
                "29521963",
                "29521963",
                "29521963",
                "29521963",
                "29521940",
                "29521948",
                "29521963",
                "29521963",
                "29521948",
                "29521963",
                "29521903",
                "29521940",
                "29521963",
                "29521963",
                "29521963",
                "29521963",
                "29521963",
                "29521963",
                "29521948",
                "29521963",
                "29521963",
                "29521948",
                "29521948",
                "29521963",
                "29521963",
                "25979753",
                "29521948",
                "29521948",
                "29521948",
                "29521948",
                "29521948",
                "29521948",
                "29521963",
                "29521948",
                "25979739",
                "29521963",
                "29521948",
                "29521923",
                "29521948",
                "29521948",
                "29521948",
                "29521948",
                "29521963",
                "29521952",
                "29521948",
                "29521948",
                "29521952",
                "29521903",
                "29521952",
                "29521911",
                "29521952",
                "29521952",
                "25979769",
                "25979769",
                "29521947",
                "25979774",
                "29521952",
                "29521960",
                "29521909",
                "29521947",
                "25979748",
                "29521947",
                "25979769",
                "29521947",
                "29521960",
                "25979769",
                "29521952",
                "29521947",
                "29521963",
                "29521960",
                "28360705",
                "29521960",
                "29521947",
                "29521952",
                "29521960",
                "29521960",
                "29521947",
                "29521952",
                "29521955",
                "29521960",
                "25979769",
                "29521952",
                "29521903",
                "25979748",
                "29521960",
                "29521947",
                "29521947",
                "29521905",
                "25979748",
                "29521947",
                "29521960",
                "29521947",
                "29521947",
                "29521960",
                "29521947",
                "29521952",
                "29521960",
                "29521952",
                "29521952",
                "25979771",
                "29521960",
                "29521960",
                "25979769",
                "29521911",
                "29521952",
                "29521952",
                "29521952",
                "25979748",
                "25979748",
                "29521947",
                "29521917",
                "29521909",
                "29521955",
                "29521911",
                "29521949",
                "29521960",
                "29521960",
                "28360705",
                "29521960",
                "29521909",
                "29521952",
                "25979774",
                "29521909",
                "29521948",
                "29521952",
                "29521952",
                "25979774",
                "29521952",
                "29521909",
                "25979769",
                "29521952",
                "29521909",
                "29521911",
                "29521911",
                "25979748",
                "29521911",
                "29521952",
                "29521905",
                "29521917",
                "29521948",
                "29521911",
                "29521911",
                "25979609",
                "29521950",
                "29521909",
                "29521950",
                "29521911",
                "25979609",
                "29521949",
                "29521909",
                "29521917",
                "29521909",
                "29521950",
                "39001441",
                "29521911",
                "29521911",
                "29521947",
                "29521943",
                "29521911",
                "29521911",
                "29521955",
                "29521909",
                "29521943",
                "39001441",
                "39001441",
                "29521909",
                "29521943",
                "29521911",
                "29521943",
                "28360707",
                "28360707",
                "29521911",
                "25979609",
                "29521917",
                "28360707",
                "28360707",
                "29521952",
                "29521907",
                "29521955",
                "29521907",
                "29521911",
                "28360707",
                "30205353",
                "29521916",
                "29521909",
                "29521950",
                "29521909",
                "29521911",
                "29521916",
                "29521911",
                "29521964",
                "29521909",
                "29521911",
                "29521916",
                "29521950",
                "29521947",
                "29521948",
                "29521911",
                "29521911",
                "29521911",
                "29521916",
                "29521909",
                "29521909",
                "29521911",
                "29521955",
                "29521905",
                "29521964",
                "29521964",
                "29521909",
                "29521964",
                "29521964",
                "29521916",
                "29521964",
                "29521948",
                "29521964",
                "29521964",
                "25979753",
                "29521950",
                "29521964",
                "25979748",
                "29521909",
                "29521909",
                "29521911",
                "29521963",
                "29521964",
                "29521916",
                "29521916",
                "29521964",
                "29521950",
                "29521964",
                "29521964",
                "29521964",
                "29521955",
                "29521911",
                "39001441",
                "29521964",
                "29521911",
                "29521911",
                "29521911",
                "29521951",
                "29521911",
                "29521964",
                "29521907",
                "29521950",
                "29521964",
                "29521916",
                "29521964",
                "29521950",
                "29521955",
                "29521955",
                "29521951",
                "29521964",
                "29521911",
                "28360702",
                "29521955",
                "29521964",
                "29521948",
                "29521950",
                "29521951",
                "30205353",
                "29521909",
                "29521911",
                "29521917",
                "29521955",
                "29521964",
                "29521964",
                "29521940",
                "29521964",
                "29521911",
                "29521948",
                "29521964",
                "29521955",
                "29521950",
                "29521964",
                "29521916",
                "29521955",
                "29521950",
                "29521964",
                "39001441",
                "29521916",
                "29521950",
                "29521909",
                "29521959",
                "29521909",
                "29521917",
                "29521950",
                "29521916",
                "29521909",
                "25979753",
                "39001441",
                "29521911",
                "29521948",
                "29521964",
                "29521943",
                "29521909",
                "29521950",
                "29521909",
                "29521950",
                "29521907",
                "29521950",
                "29521955",
                "29521909",
                "29521909",
                "29521917",
                "29521951",
                "28360707",
                "29521955",
                "29521902",
                "29521950",
                "29521917",
                "29521950",
                "29521955",
                "29521909",
                "29521955",
                "29521917",
                "29521955"
        };

        Set<String> uniqueLines = new HashSet<>();
        for (String line : lines) {
            uniqueLines.add(line);
        }

        System.out.println("Количество уникальных строк: " + uniqueLines.size());
    }
}





