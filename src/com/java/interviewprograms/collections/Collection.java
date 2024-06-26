package com.java.interviewprograms.collections;

import com.java.interviewprograms.stream.Employee;
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
        System.out.println("------List after clearing the elements: ------"+pokemonLinkedList);

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

        System.out.println(" -------After adding the new elements to the empty list: ------ "+pokemonLinkedList);
      for(Pokemon pokeLis: pokemonLinkedList){
         System.out.println(pokeLis);
       }

        ListIterator<Pokemon> listIterator = pokemonLinkedList.listIterator(2);
        while (listIterator.hasNext()) {

            System.out.println("Using Iterator: "+listIterator.next());
        }

        // Converting Linked List to Hash Set
        HashSet<Pokemon> pokemonHashSet = new HashSet<Pokemon>(pokemonLinkedList);
        System.out.println("PokeMon HashSet: "+pokemonHashSet);

        System.out.println("------Converting Linked List to Hash Set --------");

        for (Pokemon newPokeSet: pokemonHashSet){
            System.out.println(newPokeSet);
        }

        // Using For Each with Lambda Expressions and Method References

        System.out.println(" ------Printing the HashSet Using For Each with Lambda Expressions --------");
        pokemonHashSet.forEach(i-> System.out.println(i));
        System.out.println(" ----- Printing the HashSet Using For Each with Method References ------");
        pokemonHashSet.forEach(System.out::println);


        System.out.println(" ----- Printing the HashSet Using Iterator ------");
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
        System.out.println("After removing the elements in the hashset: "+pokemonHashSet);

        java.util.Collection<Pokemon> pokemonCollection = new ArrayList();
        pokemonCollection.add(new Pokemon(84,"Doduo","Normal","Flying",35,85,45,35,35,75));
        pokemonCollection.add(new Pokemon(85,"Dodrio","Normal","Ice",60,110,70,60,60,110));
        pokemonCollection.add(new Pokemon(87,"Dewgong","Water","Ice",90,70,80,70,95,70));
        pokemonCollection.add(new Pokemon(91,"Cloyster","Water","Poison",50,95,180,85,45,70));
        pokemonCollection.add(new Pokemon(92,"Gastly","Ghost","Poison",30,35,30,100,35,80));
        pokemonCollection.add(new Pokemon(93,"Haunter","Ghost","Poison",45,50,45,115,55,95));
        pokemonCollection.add(new Pokemon(94,"Gengar","Ghost","Ground",60,65,60,130,75,110));
        pokemonCollection.add(new Pokemon(95,"Onix","Rock","Psychic",35,45,160,30,45,70));
        pokemonCollection.add(new Pokemon(102,"Exeggcute","Grass","Psychic",60,40,80,60,45,40));
        pokemonCollection.add(new Pokemon(103,"Exeggutor","Grass","Rock",95,95,85,125,75,55));
        pokemonCollection.add(new Pokemon(111,"Rhyhorn","Ground","Rock",80,85,95,30,30,25));
        pokemonCollection.add(new Pokemon(112,"Rhydon","Ground","Psychic",105,130,120,45,45,40));
        pokemonCollection.add(new Pokemon(121,"Starmie","Water","Fairy",60,75,85,100,85,115));
        pokemonCollection.add(new Pokemon(122,"Mr. Mime","Psychic","Flying",40,45,65,100,120,90));
        pokemonCollection.add(new Pokemon(123,"Scyther","Bug","Psychic",70,110,80,55,80,105));
        pokemonCollection.add(new Pokemon(124,"Jynx","Ice","Flying",65,50,35,115,95,95));
        pokemonCollection.add(new Pokemon(130,"Gyarados","Water","Ice",95,125,79,60,100,81));
        pokemonCollection.add(new Pokemon(142,"Aerodactyl","Rock","Flying",80,105,65,60,75,130));
        pokemonCollection.add(new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
        pokemonCollection.add(new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));

        System.out.println(" ----- Displaying the initial Collection: \n --------");
        System.out.println(pokemonCollection);

        HashSet<Pokemon> pokemonsHashSet = new HashSet<Pokemon>(pokemonCollection);
        System.out.println(" ---- \n Displaying the Hashset \n ------");
        System.out.println(pokemonsHashSet);
        pokemonCollection.clear();

        pokemonCollection.addAll(pokemonsHashSet);
        System.out.println("----- \n Displaying the collection after deleting the duplicate entries \n -------");
        pokemonCollection.forEach(System.out::println);

        System.out.println(" ----- After adding new values to the hashset: --------");
        for (Pokemon obj2: pokemonCollection){
            System.out.println(obj2);
        }

        pokemonCollection.forEach(i-> System.out.println(" -----The Pokemon Hash Set is: ----" +i));





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

        HashMap<Integer,Pokemon> pokeMap = new HashMap<Integer,Pokemon>();
        pokeMap.put(1,new Pokemon(145,"Zapdos","Electric","Flying",90,90,85,125,90,100));
        pokeMap.put(2,new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
        pokeMap.put(3,new Pokemon(6,"Charizard","Fire","Flying",78,84,78,109,85,100));

        System.out.println("------Printing the elements in the HashMap------");
        System.out.println(pokeMap);
        String returnedValue = String.valueOf(pokeMap.put(4,new Pokemon(142,"Aerodactyl","Rock","Flying",80,105,65,60,75,130)));
        System.out.println("Returned Value is "+returnedValue);
        System.out.println("New Pokemon Map is:" + pokeMap);
        String removedValue = String.valueOf(pokeMap.remove(3));
        System.out.println("The removed Value is: "+removedValue);
        System.out.println("New Map is:" +pokeMap);
        pokeMap.replace(1,new Pokemon(1,"Bulbasaur","Grass","Poison",45,49,49,65,65,45));
        System.out.println("New Map after replacing is: "+pokeMap);
        Pokemon newPokemonMap = pokeMap.replace(2,new Pokemon(2,"Ivysaur","Grass","Poison",60,62,63,80,80,60));
        System.out.println("previous value of 2:" +newPokemonMap);
        System.out.println("New Pokemon HashMap is: "+pokeMap.toString());
        Pokemon newPoke = pokeMap.replace(5,new Pokemon(3,"Venusaur","Grass","Poison",80,82,83,100,100,80));
        System.out.println("Value of newPoke returned for key 5:" +newPoke);
        System.out.println("New Pokemon HashMap is: "+pokeMap.toString());

        for (Map.Entry mapElement : pokeMap.entrySet()){
            int key = (int) mapElement.getKey();
            Pokemon value = (Pokemon) mapElement.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println("Is the Key '4' present?" +pokeMap.containsKey(4));
        System.out.println("Is the Key '5' present?" +pokeMap.containsKey(5));
        System.out.println("Is the Value is present?" +pokeMap.containsValue(new Pokemon(2,"Ivysaur","Grass","Poison",60,62,63,80,80,60)));
        System.out.println("Is the Value is present?" +pokeMap.containsValue(new Pokemon(3,"Venusaur","Grass","Poison",80,82,83,100,100,80)));

        System.out.println("The Set is:"+pokeMap.entrySet());
        System.out.println("The value of '2' is:" +pokeMap.get(2));
        System.out.println(pokeMap.isEmpty());
        int hashCode = pokeMap.hashCode();
        System.out.println(hashCode);
        Set<Integer> s = new HashSet<>();
        s = pokeMap.keySet();
        System.out.println(s);

        Employee employee1 = new Employee(1,"Bulbasaur",1000);
        Employee employee2 = new Employee(2,"Ivysaur",2000);
        Employee employee3 = new Employee(3,"Venusaur",3000);
        Employee employee4 = new Employee(4,"Charmander",4000);
        Employee employee5 = new Employee(5,"Charmeleon",5000);
        Employee employee6 = new Employee(6,"Charizard",6000);
        Employee employee7 = new Employee(7,"Pikachu",7000);
        Employee employee8 = new Employee(1,"Bulbasaur",1000);

        HashSet<Employee> employeeHashSet = new HashSet<Employee>();

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);
        employeeHashSet.add(employee8);

        for (Employee emp: employeeHashSet){
            System.out.println(emp.getId()+"-"+emp.geteName()+"-"+emp.getSalary());
        }

        // Enum Set is a set interface handling for Enumeration types.
        EnumSet<EnumType> enumTypeEnumSet = EnumSet.of(EnumType.NORMAL,EnumType.FIRE,EnumType.WATER,EnumType.ROCK,EnumType.BUG);

Iterator<EnumType> enumTypeIterator = enumTypeEnumSet.iterator();
        System.out.println("EnumSet : ");
        while (enumTypeIterator.hasNext()){
            System.out.println(enumTypeIterator.next());
        }

        NavigableSet<Pokemon> pokemonTreeSet = new TreeSet<Pokemon>();
        pokemonTreeSet.add(new Pokemon(214,"Heracross","Bug","Ice",80,125,75,40,95,85));
        pokemonTreeSet.add(new Pokemon(222,"Corsola","Water","Flying",65,55,95,65,95,35));
        pokemonTreeSet.add(new Pokemon(228,"Houndour","Dark","Fire",45,60,30,80,50,65));
        pokemonTreeSet.add(new Pokemon(230,"Kingdra","Water","Psychic",75,95,95,95,95,85));
        pokemonTreeSet.add(new Pokemon(214,"Heracross","Bug","Ice",80,125,75,40,95,85));

        System.out.println("---- Printing the tree set using for each -----");
        for (Pokemon pokeTreeSet:pokemonTreeSet){
            System.out.println(pokeTreeSet);
        }
        System.out.println("---- Printing the tree set using method reference for each -----");
        pokemonTreeSet.forEach(System.out::println);

        System.out.println("---- Printing the tree set using iterator -----");
        Iterator<Pokemon> treeSetItr = pokemonTreeSet.iterator();
        while (treeSetItr.hasNext()){
            System.out.println(treeSetItr.next());
        }


        System.out.println("First Value is: "+pokemonTreeSet.first());
        System.out.println("Last Value is: "+pokemonTreeSet.last());

        System.out.println("----  Linked Hash Map -------");

        LinkedHashMap<Integer,Pokemon> pokemonLinkedHashMap = new LinkedHashMap<Integer,Pokemon>();
        pokemonLinkedHashMap.put(1,new Pokemon(145,"Zapdos","Electric","Flying",90,90,85,125,90,100));
        pokemonLinkedHashMap.put(2,new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
        pokemonLinkedHashMap.put(3,new Pokemon(6,"Charizard","Fire","Flying",78,84,78,109,85,100));

        Set<Integer> keys = pokemonLinkedHashMap.keySet();
        for (Integer key: keys){
            System.out.println(key + "----"+pokemonLinkedHashMap.get(key));
        }

        Set<Map.Entry<Integer, Pokemon>> entrySet = pokemonLinkedHashMap.entrySet();

        Iterator<Map.Entry<Integer, Pokemon>> iterator3 = entrySet.iterator();
        System.out.println("LinkedHashMap Entries: ");
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

        int size = 0;
        for (Map.Entry mapElement: pokemonLinkedHashMap.entrySet()){
            size++;
        }
        System.out.println("The Size of the Linked Hash Map is: "+size);

        int size1 = pokemonLinkedHashMap.size();
        System.out.println("The Size of the Linked Hash Map by using size() method: "+size1);


        for (Map.Entry<Integer,Pokemon> iteratorokemonEntry:pokemonLinkedHashMap.entrySet()){
            System.out.println(iteratorokemonEntry.getValue()+",");
        }

        LinkedHashMap<Integer,Pokemon> pokemonLinkedHashMap1 = new LinkedHashMap<Integer,Pokemon>();
        pokemonLinkedHashMap1.put(3,new Pokemon(6,"Charizard","Fire","Flying",78,84,78,109,85,100));
        pokemonLinkedHashMap1.put(1,new Pokemon(145,"Zapdos","Electric","Flying",90,90,85,125,90,100));
        pokemonLinkedHashMap1.put(2,new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));

        Map<Integer,Pokemon> map = new TreeMap<>(pokemonLinkedHashMap1);
        for (Integer skey:map.keySet()){
            System.out.println("Key -> " +skey +":Value -> " + pokemonLinkedHashMap1.get(skey));
        }



    }



}
