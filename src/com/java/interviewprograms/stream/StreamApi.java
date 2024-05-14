package com.java.interviewprograms.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(10,9,8,7,5,4,2);
            System.out.println("The Sorted Stream is: ");
            list.stream().sorted().forEach(System.out::println);

            List<Pokemon> pokemons = new ArrayList<Pokemon>();
            pokemons.add(new Pokemon(1,"Bulbasaur","Grass","Poison",45,49,49,65,65,45));
            pokemons.add(new Pokemon(2,"Ivysaur","Grass","Poison",60,62,63,80,80,60));
            pokemons.add(new Pokemon(3,"Venusaur","Grass","Poison",80,82,83,100,100,80));
            pokemons.add(new Pokemon(6,"Charizard","Fire","Flying",78,84,78,109,85,100));
            pokemons.add(new Pokemon(12,"Butterfree","Bug","Flying",60,45,50,90,80,70));
            pokemons.add(new Pokemon(13,"Weedle","Bug","Poison",40,35,30,20,20,50));
            pokemons.add(new Pokemon(14,"Kakuna","Bug","Poison",45,25,50,25,25,35));
            pokemons.add(new Pokemon(15,"Beedrill","Bug","Flying",65,90,40,45,80,75));
            pokemons.add(new Pokemon(16,"Pidgey","Normal","Flying",40,45,40,35,35,56));
            pokemons.add(new Pokemon(17,"Pidgeotto","Normal","Flying",63,60,55,50,50,71));
            pokemons.add(new Pokemon(18,"Pidgeot","Normal","Flying",83,80,75,70,70,101));
            pokemons.add(new Pokemon(21,"Spearow","Normal","Flying",40,60,30,31,31,70));
            pokemons.add(new Pokemon(22,"Fearow","Normal","Ground",65,90,65,61,61,100));
            pokemons.add(new Pokemon(31,"Nidoqueen","Poison","Ground",90,92,87,75,85,76));
            pokemons.add(new Pokemon(34,"Nidoking","Poison","Fairy",81,102,77,85,75,85));
            pokemons.add(new Pokemon(81,"Magnemite","Electric","Steel",25,35,70,95,55,45));
            pokemons.add(new Pokemon(82,"Magneton","Electric","Steel",50,60,95,120,70,70));
            pokemons.add(new Pokemon(25,"Pikachu","Electric",null,35,55,40,50,50,90));
            pokemons.add(new Pokemon(26,"Raichu","Electric",null,60,90,55,90,80,110));
            pokemons.add(new Pokemon(27,"Sandshrew","Ground",null,50,75,85,20,30,40));
            pokemons.add(new Pokemon(100,"Voltorb","Electric",null,40,30,50,55,55,100));
            pokemons.add(new Pokemon(101,"Electrode","Electric",null,60,50,70,80,80,150));
            pokemons.add(new Pokemon(125,"Electabuzz","Electric",null,65,83,57,95,85,105));
            pokemons.add(new Pokemon(135,"Jolteon","Electric",null,65,65,60,110,95,130));
            pokemons.add(new Pokemon(145,"Zapdos","Electric","Flying",90,90,85,125,90,100));
            pokemons.add(new Pokemon(172,"Pichu","Electric",null,20,40,15,35,35,60));
            pokemons.add(new Pokemon(131,"Lapras","Water","ice",130,85,80,85,95,60));

            // intermediate Operations Filter, Sort, Map
           // terminal Operations - forEach(), collect(), match(), count(), reduce()

            System.out.println("---- Sort Pokemons By Name -----");
            pokemons.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);

            System.out.println("----- Sort Pokemons By Id -----");
            List<Pokemon> sortById = pokemons.stream().sorted((e1,e2) -> (int) e1.getNumber()-e2.getNumber()).collect(Collectors.toList());
            System.out.println(sortById);

            System.out.println("----- Filtering the Pokemons By having Even HP: -----");
            pokemons.stream().filter(i -> i.getHp()%2==0).forEach(System.out::println);

            System.out.println("----- Filtering the Pokemons By having Odd Attack Numbers: -----");
            pokemons.stream().filter(p-> p.getAttack()%2 != 0).forEach(System.out::println);

            System.out.println("----- Multiplying defense to 10 and divided by 100 for the Pokemons: ----- ");
            List<Integer> mapPokemon = pokemons.stream().map(i-> i.getDefense()*10/100).collect(Collectors.toList());
            System.out.println(mapPokemon);

            System.out.println("----- Get the Electric pokemon Names in sorted by numbers in descending order -----");
            List<String> electricPokemon = pokemons.stream().filter(t-> t.getType1().equals("Electric")).sorted(Comparator.comparing(Pokemon::getNumber).reversed()).map(Pokemon::getName).collect(Collectors.toList());
            System.out.println(electricPokemon);

            System.out.println("----- Get the flying pokemon names in descending order -----");
            List<String> flyingPokemon = pokemons.stream().filter(t-> t.getType2() == "Flying").sorted(Comparator.comparing(Pokemon::getName).reversed()).map(Pokemon::getName).collect(Collectors.toList());
            System.out.println(flyingPokemon);

            System.out.println("The pokemon names string combine in alist");
            Optional<String> stringCombine = pokemons.stream().map(Pokemon::getName).reduce((r1,r2) -> r1 +" - "+ r2);
            System.out.println(stringCombine);

            System.out.println("Product of all pokemon HPs");
            int product = pokemons.stream().map(Pokemon::getHp).reduce((h1,h2) -> h1*h2).orElse(-1);
            System.out.println(product);

            System.out.println("Sum of all pokemon attack power");
           int sum = pokemons.stream().map(Pokemon::getAttack).reduce(0, Integer::sum);
            System.out.println(sum);

            System.out.println("Maximum Hp");
            int maximum = pokemons.stream().map(Pokemon::getHp).max(Integer::compare).get();
            System.out.println(maximum);

            System.out.println("The pokemon with maximum HP is: ");
            List<Pokemon> maxHpPokemon = pokemons.stream().sorted((e1,e2)->e2.getHp()-e1.getHp()).limit(1).collect(Collectors.toList());
            System.out.println(maxHpPokemon);

            System.out.println("Pokemon names starts with B");
            pokemons.stream().filter(s->s.getName().startsWith("B")).forEach(System.out::println);

            System.out.println("Pokemon names ends with e");
            List<String> endingNames = pokemons.stream().filter(e->e.getName().endsWith("e")).map(Pokemon::getName).collect(Collectors.toList());
            System.out.println(endingNames);

            System.out.println("Pokemon having defense of even numbers");
            List<Integer> evenDefense = pokemons.stream().filter(i->i.getDefense()%2==0).map(Pokemon::getDefense).collect(Collectors.toList());
            System.out.println(evenDefense);

            System.out.println("Pokemon having defense of even numbers without duplicates");
            List<Integer> evenDefenseWithoutDuplicates = pokemons.stream().filter(i->i.getDefense()%2==0)
                    .map(Pokemon::getDefense).distinct()
                    .collect(Collectors.toList());
            System.out.println(evenDefenseWithoutDuplicates);

            System.out.println("sum of Pokemon having defense of even numbers");
             int sumOfEvenDefense = pokemons.stream().filter(i -> i.getDefense() % 2 == 0)
                    .map(Pokemon::getDefense).reduce(0, Integer::sum);
            System.out.println(sumOfEvenDefense);

            System.out.println("Find Any Pokemon Name");
            Optional<String> findAnyPokemon = pokemons.stream().map(Pokemon::getName).findAny();
            System.out.println(findAnyPokemon.get());

            System.out.println("Find First Pokemon Name");
            Optional<String> findFirstPokemon = pokemons.stream().map(Pokemon::getName).findFirst();
            System.out.println(findFirstPokemon.get());

            System.out.println("Is the pokemon names first characters are in uppercase");
            boolean answer = pokemons.stream().map(Pokemon::getName).anyMatch(s-> Character.isUpperCase(s.charAt(0)));
            System.out.println(answer);

            System.out.println("Is any of pokemon Special Defense is divisible by 5 and it is equals to 10");
            boolean answer1 = pokemons.stream().map(Pokemon::getSpecialDefense).anyMatch(n -> n/5== 10);
            System.out.println(answer1);

            System.out.println("Is all the pokemon Special Defense divisible by 5");
            boolean answer2 = pokemons.stream().map(Pokemon::getSpecialDefense).allMatch(n -> n/5 == 0);
            System.out.println(answer2);

            System.out.println("Check all the pokemon names length is above or equal to 5");
            boolean nameLengthCheck = pokemons.stream().map(Pokemon::getName).allMatch(str ->str.length() >= 5);
            System.out.println(nameLengthCheck);

            System.out.println("How many pokemon names in the list");
            long pokemonNamesCount = pokemons.stream().map(Pokemon::getName).count();
            System.out.println(pokemonNamesCount);

        List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1,"Bulbasaur",1000));
            employees.add(new Employee(2,"Ivysaur",2000));
            employees.add(new Employee(3,"Venusaur",3000));
            employees.add(new Employee(4,"Charmander",4000));
            employees.add(new Employee(5,"Charmeleon",5000));
            employees.add(new Employee(6,"Charizard",6000));
            employees.add(new Employee(7,"Pikachu",7000));

            // Sort By Salary

            System.out.println("----- Get the Third highest Salary -----");
            List<Employee> empSortedList = employees.stream().sorted((o1,o2)->(int)(o2.getSalary()- o1.getSalary()))
                    .skip(2).limit(1).collect(Collectors.toList());
            System.out.println(empSortedList);

        }
    }
