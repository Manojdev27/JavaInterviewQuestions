package com.java.interviewprograms.collections;

import com.java.interviewprograms.stream.Pokemon;

import java.util.*;


public class Collection {

    public static <T>ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<T>();

for (T element:list){
    if (!newList.contains(element)){
        newList.add(element);
    }

}
return newList;
    }


    public ArrayList<Pokemon> reverseArray(ArrayList<Pokemon> reverseList){
        ArrayList<Pokemon> revArrayList = new ArrayList<Pokemon>();
        for (int i = reverseList.size()-1; i >=0 ; i--) {
            revArrayList.add(reverseList.get(i));
        }
        return revArrayList;
    }

    public static Set<Integer> convert(int[] array){
        Set<Integer> set = new HashSet<Integer>();
        for (int element:array){
            set.add(element);
        }
        return set;
    }

//    public static Set<Integer> convertArrayToSet(int[] array){
//        return Arrays.stream(array).collect(Collectors.toSet());
//    }
    public static void main(String[] args) {
        ArrayList<Pokemon> list = new ArrayList<>();
        list.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));
        list.add(new Pokemon(85,"Dodrio","Normal","Ice",60,110,70,60,60,110));
        list.add(new Pokemon(87,"Dewgong","Water","Ice",90,70,80,70,95,70));
        list.add(new Pokemon(91,"Cloyster","Water","Poison",50,95,180,85,45,70));
        list.add(new Pokemon(92,"Gastly","Ghost","Poison",30,35,30,100,35,80));
        list.add(new Pokemon(93,"Haunter","Ghost","Poison",45,50,45,115,55,95));
        list.add(new Pokemon(94,"Gengar","Ghost","Ground",60,65,60,130,75,110));
        list.add(new Pokemon(95,"Onix","Rock","Psychic",35,45,160,30,45,70));
        list.add(new Pokemon(102,"Exeggcute","Grass","Psychic",60,40,80,60,45,40));
        list.add(new Pokemon(103,"Exeggutor","Grass","Rock",95,95,85,125,75,55));
        list.add(new Pokemon(111,"Rhyhorn","Ground","Rock",80,85,95,30,30,25));
        list.add(new Pokemon(112,"Rhydon","Ground","Psychic",105,130,120,45,45,40));
        list.add(new Pokemon(121,"Starmie","Water","Fairy",60,75,85,100,85,115));
        list.add(new Pokemon(122,"Mr. Mime","Psychic","Flying",40,45,65,100,120,90));
        list.add(new Pokemon(123,"Scyther","Bug","Psychic",70,110,80,55,80,105));
        list.add(new Pokemon(124,"Jynx","Ice","Flying",65,50,35,115,95,95));
        list.add(new Pokemon(130,"Gyarados","Water","Ice",95,125,79,60,100,81));
        list.add(new Pokemon(142,"Aerodactyl","Rock","Flying",80,105,65,60,75,130));
        list.add(new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
        list.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));


        for (Pokemon pokemon: list){
            System.out.println(pokemon);
        }

        // Remove an element
        System.out.println("The removed pokemon is:" +list.remove(15));

        for (Pokemon pokemon: list){
            System.out.println(pokemon);
        }

        // Update the existing with a new one
        Pokemon setNewPokemon = list.set(3,(new Pokemon(146,"Moltres","Fire","Flying",90,100,90,125,85,90)));

        System.out.println("After Operation: " +list);
        System.out.println("Replaced Element: " +setNewPokemon);

        for (Pokemon pokemon: list){
            System.out.println(pokemon);
        }

        ArrayList<Pokemon> newList = removeDuplicates(list);

        System.out.println("ArrayList with duplicates removed: "+newList);

        System.out.println("ArrayList before Reversing: ");
        for (Pokemon pokemon: newList){
            System.out.println(pokemon);
        }

        Collection collection = new Collection();
        ArrayList<Pokemon> revList = collection.reverseArray(list);
        System.out.println("ArrayList after reversing: "+revList);

        List<Pokemon> arrList2 = list.subList(2,5);
        System.out.println("Sublist of arrList is: "+ arrList2);

        LinkedList<Pokemon> pokemonLinkedList = new LinkedList<Pokemon>(list);
        System.out.println("Linked List is "+pokemonLinkedList);
        System.out.println("Fetch an element in a linked list: "+pokemonLinkedList.get(5));

        pokemonLinkedList.add(new Pokemon(164,"Noctowl","Normal","Flying",100,50,50,86,96,70));

        System.out.println("After adding a new element "+pokemonLinkedList);

        pokemonLinkedList.add(1,new Pokemon(163,"Hoothoot","Normal","Flying",60,30,30,36,56,50));
        System.out.println("adding a new element to the index:" +pokemonLinkedList);

        System.out.println("Does the linked List contains: "+pokemonLinkedList.contains(new Pokemon(85,"Dodrio","Normal","Ice",60,110,70,60,60,110)));

        System.out.println("The object replaced is:" +pokemonLinkedList.set(5,(new Pokemon(121,"Starmie","Water","Fairy",60,75,85,100,85,115))));

        for(Pokemon newPoke:pokemonLinkedList){
            System.out.println(newPoke);
        }

        pokemonLinkedList.clear();
        System.out.println("List after clearing the elements: "+pokemonLinkedList);

        pokemonLinkedList.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));
        pokemonLinkedList.add(new Pokemon(85,"Dodrio","Normal","Ice",60,110,70,60,60,110));
        pokemonLinkedList.add(new Pokemon(87,"Dewgong","Water","Ice",90,70,80,70,95,70));
        pokemonLinkedList.add(new Pokemon(91,"Cloyster","Water","Poison",50,95,180,85,45,70));
        pokemonLinkedList.add(new Pokemon(92,"Gastly","Ghost","Poison",30,35,30,100,35,80));
        pokemonLinkedList.add(new Pokemon(93,"Haunter","Ghost","Poison",45,50,45,115,55,95));
        pokemonLinkedList.add(new Pokemon(94,"Gengar","Ghost","Ground",60,65,60,130,75,110));
        pokemonLinkedList.add(new Pokemon(95,"Onix","Rock","Psychic",35,45,160,30,45,70));
        pokemonLinkedList.add(new Pokemon(102,"Exeggcute","Grass","Psychic",60,40,80,60,45,40));
        pokemonLinkedList.add(new Pokemon(103,"Exeggutor","Grass","Rock",95,95,85,125,75,55));
        pokemonLinkedList.add(new Pokemon(111,"Rhyhorn","Ground","Rock",80,85,95,30,30,25));
        pokemonLinkedList.add(new Pokemon(112,"Rhydon","Ground","Psychic",105,130,120,45,45,40));
        pokemonLinkedList.add(new Pokemon(121,"Starmie","Water","Fairy",60,75,85,100,85,115));
        pokemonLinkedList.add(new Pokemon(122,"Mr. Mime","Psychic","Flying",40,45,65,100,120,90));
        pokemonLinkedList.add(new Pokemon(123,"Scyther","Bug","Psychic",70,110,80,55,80,105));
        pokemonLinkedList.add(new Pokemon(124,"Jynx","Ice","Flying",65,50,35,115,95,95));
        pokemonLinkedList.add(new Pokemon(130,"Gyarados","Water","Ice",95,125,79,60,100,81));
        pokemonLinkedList.add(new Pokemon(142,"Aerodactyl","Rock","Flying",80,105,65,60,75,130));
        pokemonLinkedList.add(new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
        pokemonLinkedList.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));

        System.out.println("After adding the new elements to the empty list: "+pokemonLinkedList);
      for(Pokemon pokeLis: pokemonLinkedList){
         System.out.println(pokeLis);
       }

        ListIterator<Pokemon> listIterator = pokemonLinkedList.listIterator(2);
        while (listIterator.hasNext()) {

            System.out.println("Using Iterator: "+listIterator.next());
        }

        HashSet<Pokemon> pokemonHashSet = new HashSet<Pokemon>(pokemonLinkedList);
        System.out.println("PokeMon HashSet: "+pokemonHashSet);

        for (Pokemon newPokeSet: pokemonHashSet){
            System.out.println(newPokeSet);
        }

        pokemonHashSet.forEach(i-> System.out.println(i));
        pokemonHashSet.forEach(System.out::println);

        System.out.println("Using Iterator: ");
        Iterator iterator = pokemonHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Hashset removing duplicates");

        HashSet<Pokemon> newPokeSet = new HashSet<Pokemon>();
        Pokemon pokemon1 = new Pokemon(84, "Doduo","Normal", "Flying", 35, 85,45, 35, 35, 75);
        Pokemon pokemon2 = new Pokemon(84, "Doduo","Normal", "Flying", 35, 85,45, 35, 35, 75);
        newPokeSet.add(pokemon1);
        newPokeSet.add(pokemon2);
        Iterator<Pokemon> iterator1 = newPokeSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Pokemon");
        hashSet.add("Harry Potter");
        hashSet.add("Pokemon");
        System.out.println(hashSet);

        System.out.println(newPokeSet);

        pokemonHashSet.clear();
        System.out.println("After removing: "+pokemonHashSet);

        pokemonHashSet.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));
        pokemonHashSet.add(new Pokemon(85,"Dodrio","Normal","Ice",60,110,70,60,60,110));
        pokemonHashSet.add(new Pokemon(87,"Dewgong","Water","Ice",90,70,80,70,95,70));
        pokemonHashSet.add(new Pokemon(91,"Cloyster","Water","Poison",50,95,180,85,45,70));
        pokemonHashSet.add(new Pokemon(92,"Gastly","Ghost","Poison",30,35,30,100,35,80));
        pokemonHashSet.add(new Pokemon(93,"Haunter","Ghost","Poison",45,50,45,115,55,95));
        pokemonHashSet.add(new Pokemon(94,"Gengar","Ghost","Ground",60,65,60,130,75,110));
        pokemonHashSet.add(new Pokemon(95,"Onix","Rock","Psychic",35,45,160,30,45,70));
        pokemonHashSet.add(new Pokemon(102,"Exeggcute","Grass","Psychic",60,40,80,60,45,40));
        pokemonHashSet.add(new Pokemon(103,"Exeggutor","Grass","Rock",95,95,85,125,75,55));
        pokemonHashSet.add(new Pokemon(111,"Rhyhorn","Ground","Rock",80,85,95,30,30,25));
        pokemonHashSet.add(new Pokemon(112,"Rhydon","Ground","Psychic",105,130,120,45,45,40));
        pokemonHashSet.add(new Pokemon(121,"Starmie","Water","Fairy",60,75,85,100,85,115));
        pokemonHashSet.add(new Pokemon(122,"Mr. Mime","Psychic","Flying",40,45,65,100,120,90));
        pokemonHashSet.add(new Pokemon(123,"Scyther","Bug","Psychic",70,110,80,55,80,105));
        pokemonHashSet.add(new Pokemon(124,"Jynx","Ice","Flying",65,50,35,115,95,95));
        pokemonHashSet.add(new Pokemon(130,"Gyarados","Water","Ice",95,125,79,60,100,81));
        pokemonHashSet.add(new Pokemon(142,"Aerodactyl","Rock","Flying",80,105,65,60,75,130));
        pokemonHashSet.add(new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
        pokemonHashSet.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));

        System.out.println("After adding new values to the hashset: ");
        for (Pokemon obj: pokemonHashSet){
            System.out.println(obj);
        }

        int[] arr = {1,2,3,4,5,6,7,8,9};

        Set<Integer> newSet = convert(arr);

        Iterator<Integer> iterator2= newSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next() +" ");
        }
        System.out.println(newSet);

//        int[] arr2 ={30,40,50,60,70,80};
//        Set<Integer> set2 = (Set<Integer>) convertArrayToSet(arr2);
//        System.out.println("Set: "+set2);
    }

}
