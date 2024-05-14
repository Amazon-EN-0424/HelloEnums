package com.ironhack.buckets;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Jim, Michael, Pam, Dwight
//        +555 435 01
//        +555 435 58
//        +555 435 59
//        +555 435 00


//        TODO: if you are VERY bored (and you don't own Diablo 4) check out about hashing

//        TODO: check out data structures and big(O) notation

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Michael", "+555 435 01");
        phoneBook.put("Jim", "+555 435 58");
        phoneBook.put("Pam", "+555 435 59");
        phoneBook.put("Dwight", "+555 435 00");



        var dwightNumber = phoneBook.get("Dwight");
        System.out.println(dwightNumber);

        var kevinNumber = phoneBook.get("Kevin");
        System.out.println(kevinNumber);




        var kombucha1 = new Kombucha("OrangePassion", "Carrots and Mango");
        var kombucha2 = new Kombucha("YellowWaves", "Lemon and Ginger");

        var kombuchaCatalogue = new HashMap<String, Kombucha>();
        kombuchaCatalogue.put("001A", kombucha1);
        kombuchaCatalogue.put("077C", kombucha2);

        System.out.println(kombuchaCatalogue);

        System.out.println(kombuchaCatalogue.get("001A"));


        List<String> authors = new ArrayList<>(List.of("Spinoza",
                "Huxley",
                "Orwell",
                "Dante",
                "Huxley",
                "Dostoevsky" ,
                "Dostoevsky",
                "Kafka",
                "Kafka",
                "Kafka"));

        System.out.println(authors);
        System.out.println(authors.size());

        Set<String> uniqueAuthorsInMyCollection = new HashSet<>();

        for(String author : authors) {
            uniqueAuthorsInMyCollection.add(author);
        }

        System.out.println(uniqueAuthorsInMyCollection);
        System.out.println(uniqueAuthorsInMyCollection.size());




        System.out.printf("Originally there where %d authors and only %d of them are unique names, you have %d duplicates",
                authors.size(), uniqueAuthorsInMyCollection.size(), authors.size() - uniqueAuthorsInMyCollection.size());
    }
}
