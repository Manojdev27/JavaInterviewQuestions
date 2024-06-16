package com.java.interviewprograms.stream;

import com.java.interviewprograms.Sorting;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StreamApi {

    public static <T>Stream<T> getSliceOfStream(Stream<T> stream,int startIndex, int endIndex){
        return stream.skip(startIndex).limit(endIndex-startIndex + 1);
    }

    public static Set<Character> convertStringToCharListAndRemoveDuplicates(String str){
        Set<Character> chars = str.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        return chars;

    }

    public static List<Character> convertStringToCharList(String str){
        List<Character> chars = new ArrayList<>();

        for (char ch:str.toCharArray()){
            chars.add(ch);
        }
        return chars;
    }
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
            pokemons.add(new Pokemon(65,"Alakazam","Psychic",null,55,50,45,135,95,120));
            pokemons.add(new Pokemon(142,"Aerodactyl","Rock","Flying",80,105,65,60,75,130));
            pokemons.add(new Pokemon(144,"Articuno","Ice","Flying",90,85,100,95,125,85));
            pokemons.add(new Pokemon(190,"Aipom","Normal",null,55,70,55,40,55,85));
            pokemons.add(new Pokemon(101,"Electrode","Electric",null,60,50,70,80,80,150));
            pokemons.add(new Pokemon(125,"Electabuzz","Electric",null,65,83,57,95,85,105));
            pokemons.add(new Pokemon(133,"Eevee","Normal",null,55,55,50,45,65,55));
            pokemons.add(new Pokemon(244,"Entei","Fire",null,115,115,85,90,75,100));


            // intermediate Operations Filter, Sort, Map
           // terminal Operations - forEach(), collect(), match(), count(), reduce()

            System.out.println("---- Sort Pokemons By Name -----");
            pokemons.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);

            System.out.println("----- Sort Pokemons By Id -----");
            List<Pokemon> sortById = pokemons.stream().sorted((e1,e2) -> (int) e1.getId()-e2.getId()).collect(Collectors.toList());
            System.out.println(sortById);

            System.out.println("----- Filtering the Pokemons By having Even HP: -----");
            pokemons.stream().filter(i -> i.getHp()%2==0).forEach(System.out::println);

            System.out.println("----- Filtering the Pokemons By having Odd Attack Numbers: -----");
            pokemons.stream().filter(p-> p.getAttack()%2 != 0).forEach(System.out::println);

            System.out.println("----- Multiplying defense to 10 and divided by 100 for the Pokemons: ----- ");
            List<Integer> mapPokemon = pokemons.stream().map(i-> i.getDefense()*10/100).collect(Collectors.toList());
            System.out.println(mapPokemon);

            System.out.println("----- Get the Electric pokemon Names in sorted by numbers in descending order -----");
            List<String> electricPokemon = pokemons.stream().filter(t-> t.getType1().equals("Electric")).sorted(Comparator.comparing(Pokemon::getId).reversed()).map(Pokemon::getName).collect(Collectors.toList());
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

            System.out.println("Parallel Stream");
            pokemons.parallelStream().map(Pokemon::getName).sorted().forEach(System.out::println);


        System.out.println("Flat Map Names");
            pokemons.stream().sorted(Comparator.comparing(Pokemon::getName)).flatMap(Stream::of)
                    .forEach(System.out::println);

      List<Character> flatMapGetChar = pokemons.stream().flatMap(s->Stream.of(s.getName().charAt(2))).collect(Collectors.toList());
        System.out.println(flatMapGetChar);






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

        List<Integer> evenHP = pokemons.stream().map(Pokemon::getHp).filter(hp -> hp %2==0).collect(Collectors.toList());
        System.out.println("The Even Hp is"+evenHP);

        List<Integer> oddHP = pokemons.stream().map(Pokemon::getHp).filter(hp -> hp %2!=0).collect(Collectors.toList());
        System.out.println("The Odd Hp is"+oddHP);


        List<List<Integer>> listOfListOfInts = Arrays.asList(evenHP,oddHP);
        System.out.println("The structure before flattening: " +listOfListOfInts);

      List<Integer> evenAndOdd = listOfListOfInts.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("The Structure after flattening: "+evenAndOdd);

        // Integer Stream
        System.out.println("Integer Stream : ");
        IntStream.range(1,100).forEach(i-> System.out.println(i));

        System.out.println("Integer Stream with Skip: ");
        IntStream.range(1,100).skip(10).forEach(System.out::println);

        System.out.println("Integer Stream with sum");
        System.out.println(IntStream.range(1, 100).sum());

        System.out.println("Using Stream.of, sorted and findfirst");
        Stream.of("Java","Ruby", "Python", "C++").sorted().findFirst().ifPresent(System.out::println);

        System.out.println("Sort, filter and print the elements in an array");
    String[]  languages = {"Programming", "Coding", "Large Language Model","Natural Language processing", "Pokemons"};
    Arrays.stream(languages).filter(x->x.startsWith("P")).sorted().forEach(System.out::println);

        System.out.println("Print the squares of an int array");
        int[] num = {2,4,5,7,9,10,12,15,19};
        Arrays.stream(num).map(x -> x*x).forEach(System.out::println);

        System.out.println(" Converting the list into stream and converting the element to lowercase, filter the values starts with 'a' and print:");
        List<String> pokemon = Arrays.asList("Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran♀","Nidorina","Nidoqueen","Nidoran♂","Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff","Wigglytuff","Zubat","Golbat","Oddish","Gloom","Vileplume","Paras","Parasect","Venonat","Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck","Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag","Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee","Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew","Chikorita","Bayleef","Meganium","Cyndaquil","Quilava","Typhlosion","Totodile","Croconaw","Feraligatr","Sentret","Furret","Hoothoot","Noctowl","Ledyba","Ledian","Spinarak","Ariados","Crobat","Chinchou","Lanturn","Pichu","Cleffa","Igglybuff","Togepi","Togetic","Natu","Xatu","Mareep","Flaaffy","Ampharos","Bellossom","Marill","Azumarill","Sudowoodo","Politoed","Hoppip","Skiploom","Jumpluff","Aipom","Sunkern","Sunflora","Yanma","Wooper","Quagsire","Espeon","Umbreon","Murkrow","Slowking","Misdreavus","Unown","Wobbuffet","Girafarig","Pineco","Forretress","Dunsparce","Gligar","Steelix","Snubbull","Granbull","Qwilfish","Scizor","Shuckle","Heracross","Sneasel","Teddiursa","Ursaring","Slugma","Magcargo","Swinub","Piloswine","Corsola","Remoraid","Octillery","Delibird","Mantine","Skarmory","Houndour","Houndoom","Kingdra","Phanpy","Donphan","Porygon2","Stantler","Smeargle","Tyrogue","Hitmontop","Smoochum","Elekid","Magby","Miltank","Blissey","Raikou","Entei","Suicune","Larvitar","Pupitar","Tyranitar","Lugia","Ho-oh","Celebi","Treecko","Grovyle","Sceptile","Torchic","Combusken","Blaziken","Mudkip","Marshtomp","Swampert","Poochyena","Mightyena","Zigzagoon","Linoone","Wurmple","Silcoon","Beautifly","Cascoon","Dustox","Lotad","Lombre","Ludicolo","Seedot","Nuzleaf","Shiftry","Taillow","Swellow","Wingull","Pelipper","Ralts","Kirlia","Gardevoir","Surskit","Masquerain","Shroomish","Breloom","Slakoth","Vigoroth","Slaking","Nincada","Ninjask","Shedinja","Whismur","Loudred","Exploud","Makuhita","Hariyama","Azurill","Nosepass","Skitty","Delcatty","Sableye","Mawile","Aron","Lairon","Aggron","Meditite","Medicham","Electrike","Manectric","Plusle","Minun","Volbeat","Illumise","Roselia","Gulpin","Swalot","Carvanha","Sharpedo","Wailmer","Wailord","Numel","Camerupt","Torkoal","Spoink","Grumpig","Spinda","Trapinch","Vibrava","Flygon","Cacnea","Cacturne","Swablu","Altaria","Zangoose","Seviper","Lunatone","Solrock","Barboach","Whiscash","Corphish","Crawdaunt","Baltoy","Claydol","Lileep","Cradily","Anorith","Armaldo","Feebas","Milotic","Castform","Kecleon","Shuppet","Banette","Duskull","Dusclops","Tropius","Chimecho","Absol","Wynaut","Snorunt","Glalie","Spheal","Sealeo","Walrein","Clamperl","Huntail","Gorebyss","Relicanth","Luvdisc","Bagon","Shelgon","Salamence","Beldum","Metang","Metagross","Regirock","Regice","Registeel","Latias","Latios","Kyogre","Groudon","Rayquaza","Jirachi","Deoxys","Turtwig","Grotle","Torterra","Chimchar","Monferno","Infernape","Piplup","Prinplup","Empoleon","Starly","Staravia","Staraptor","Bidoof","Bibarel","Kricketot","Kricketune","Shinx","Luxio","Luxray","Budew","Roserade","Cranidos","Rampardos","Shieldon","Bastiodon","Burmy","Wormadam","Mothim","Combee","Vespiquen","Pachirisu","Buizel","Floatzel","Cherubi","Cherrim","Shellos","Gastrodon","Ambipom","Drifloon","Drifblim","Buneary","Lopunny","Mismagius","Honchkrow","Glameow","Purugly","Chingling","Stunky","Skuntank","Bronzor","Bronzong","Bonsly","Mime Jr.","Happiny","Chatot","Spiritomb","Gible","Gabite","Garchomp","Munchlax","Riolu","Lucario","Hippopotas","Hippowdon","Skorupi","Drapion","Croagunk","Toxicroak","Carnivine","Finneon","Lumineon","Mantyke","Snover","Abomasnow","Weavile","Magnezone","Lickilicky","Rhyperior","Tangrowth","Electivire","Magmortar","Togekiss","Yanmega","Leafeon","Glaceon","Gliscor","Mamoswine","Porygon-Z","Gallade","Probopass","Dusknoir","Froslass","Rotom","Uxie","Mesprit","Azelf","Dialga","Palkia","Heatran","Regigigas","Giratina","Cresselia","Phione","Manaphy","Darkrai","Shaymin","Arceus","Victini","Snivy","Servine","Serperior","Tepig","Pignite","Emboar","Oshawott","Dewott","Samurott","Patrat","Watchog","Lillipup","Herdier","Stoutland","Purrloin","Liepard","Pansage","Simisage","Pansear","Simisear","Panpour","Simipour","Munna","Musharna","Pidove","Tranquill","Unfezant","Blitzle","Zebstrika","Roggenrola","Boldore","Gigalith","Woobat","Swoobat","Drilbur","Excadrill","Audino","Timburr","Gurdurr","Conkeldurr","Tympole","Palpitoad","Seismitoad","Throh","Sawk","Sewaddle","Swadloon","Leavanny","Venipede","Whirlipede","Scolipede","Cottonee","Whimsicott","Petilil","Lilligant","Basculin","Sandile","Krokorok","Krookodile","Darumaka","Darmanitan","Maractus","Dwebble","Crustle","Scraggy","Scrafty","Sigilyph","Yamask","Cofagrigus","Tirtouga","Carracosta","Archen","Archeops","Trubbish","Garbodor","Zorua","Zoroark","Minccino","Cinccino","Gothita","Gothorita","Gothitelle","Solosis","Duosion","Reuniclus","Ducklett","Swanna","Vanillite","Vanillish","Vanilluxe","Deerling","Sawsbuck","Emolga","Karrablast","Escavalier","Foongus","Amoonguss","Frillish","Jellicent","Alomomola","Joltik","Galvantula","Ferroseed","Ferrothorn","Klink","Klang","Klinklang","Tynamo","Eelektrik","Eelektross","Elgyem","Beheeyem","Litwick","Lampent","Chandelure","Axew","Fraxure","Haxorus","Cubchoo","Beartic","Cryogonal","Shelmet","Accelgor","Stunfisk","Mienfoo","Mienshao","Druddigon","Golett","Golurk","Pawniard","Bisharp","Bouffalant","Rufflet","Braviary","Vullaby","Mandibuzz","Heatmor","Durant","Deino","Zweilous","Hydreigon","Larvesta","Volcarona","Cobalion","Terrakion","Virizion","Tornadus","Thundurus","Reshiram","Zekrom","Landorus","Kyurem","Keldeo","Meloetta","Genesect","Chespin","Quilladin","Chesnaught","Fennekin","Braixen","Delphox","Froakie","Frogadier","Greninja","Bunnelby","Diggersby","Fletchling","Fletchinder","Talonflame","Scatterbug","Spewpa","Vivillon","Litleo","Pyroar","Flabébé","Floette","Florges","Skiddo","Gogoat","Pancham","Pangoro","Furfrou","Espurr","Meowstic","Honedge","Doublade","Aegislash","Spritzee","Aromatisse","Swirlix","Slurpuff","Inkay","Malamar","Binacle","Barbaracle","Skrelp","Dragalge","Clauncher","Clawitzer","Helioptile","Heliolisk","Tyrunt","Tyrantrum","Amaura","Aurorus","Sylveon","Hawlucha","Dedenne","Carbink","Goomy","Sliggoo","Goodra","Klefki","Phantump","Trevenant","Pumpkaboo","Gourgeist","Bergmite","Avalugg","Noibat","Noivern","Xerneas","Yveltal","Zygarde","Diancie","Hoopa","Volcanion","Rowlet","Dartrix","Decidueye","Litten","Torracat","Incineroar","Popplio","Brionne","Primarina","Pikipek","Trumbeak","Toucannon","Yungoos","Gumshoos","Grubbin","Charjabug","Vikavolt","Crabrawler","Crabominable","Oricorio","Cutiefly","Ribombee","Rockruff","Lycanroc","Wishiwashi","Mareanie","Toxapex","Mudbray","Mudsdale","Dewpider","Araquanid","Fomantis","Lurantis","Morelull","Shiinotic","Salandit","Salazzle","Stufful","Bewear","Bounsweet","Steenee","Tsareena","Comfey","Oranguru","Passimian","Wimpod","Golisopod","Sandygast","Palossand","Pyukumuku","Type: Null","Silvally","Minior","Komala","Turtonator","Togedemaru","Mimikyu","Bruxish","Drampa","Dhelmise","Jangmo-o","Hakamo-o","Kommo-o","Tapu Koko","Tapu Lele","Tapu Bulu","Tapu Fini","Cosmog","Cosmoem","Solgaleo","Lunala","Nihilego","Buzzwole","Pheromosa","Xurkitree","Celesteela","Kartana","Guzzlord","Necrozma","Magearna","Marshadow","Poipole","Naganadel","Stakataka","Blacephalon","Zeraora","Meltan","Melmetal","Grookey","Thwackey","Rillaboom","Scorbunny","Raboot","Cinderace","Sobble","Drizzile","Inteleon","Skwovet","Greedent","Rookidee","Corvisquire","Corviknight","Blipbug","Dottler","Orbeetle","Nickit","Thievul","Gossifleur","Eldegoss","Wooloo","Dubwool","Chewtle","Drednaw","Yamper","Boltund","Rolycoly","Carkol","Coalossal","Applin","Flapple","Appletun","Silicobra","Sandaconda","Cramorant","Arrokuda","Barraskewda","Toxel","Toxtricity","Sizzlipede","Centiskorch","Clobbopus","Grapploct","Sinistea","Polteageist","Hatenna","Hattrem","Hatterene","Impidimp","Morgrem","Grimmsnarl","Obstagoon","Perrserker","Cursola","Sirfetch'd","Mr. Rime","Runerigus","Milcery","Alcremie","Falinks","Pincurchin","Snom","Frosmoth","Stonjourner","Eiscue","Indeedee","Morpeko","Cufant","Copperajah","Dracozolt","Arctozolt","Dracovish","Arctovish","Duraludon","Dreepy","Drakloak","Dragapult","Zacian","Zamazenta","Eternatus","Kubfu","Urshifu","Zarude","Regieleki","Regidrago","Glastrier","Spectrier","Calyrex","Wyrdeer","Kleavor","Ursaluna","Basculegion","Sneasler","Overqwil","Enamorus","Sprigatito","Floragato","Meowscarada","Fuecoco","Crocalor","Skeledirge","Quaxly","Quaxwell","Quaquaval","Lechonk","Oinkologne","Tarountula","Spidops","Nymble","Lokix","Pawmi","Pawmo","Pawmot","Tandemaus","Maushold","Fidough","Dachsbun","Smoliv","Dolliv","Arboliva","Squawkabilly","Nacli","Naclstack","Garganacl","Charcadet","Armarouge","Ceruledge","Tadbulb","Bellibolt","Wattrel","Kilowattrel","Maschiff","Mabosstiff","Shroodle","Grafaiai","Bramblin","Brambleghast","Toedscool","Toedscruel","Klawf","Capsakid","Scovillain","Rellor","Rabsca","Flittle","Espathra","Tinkatink","Tinkatuff","Tinkaton","Wiglett","Wugtrio","Bombirdier","Finizen","Palafin","Varoom","Revavroom","Cyclizar","Orthworm","Glimmet","Glimmora","Greavard","Houndstone","Flamigo","Cetoddle","Cetitan","Veluza","Dondozo","Tatsugiri","Annihilape","Clodsire","Farigiraf","Dudunsparce","Kingambit","Great Tusk","Scream Tail","Brute Bonnet","Flutter Mane","Slither Wing","Sandy Shocks","Iron Treads","Iron Bundle","Iron Hands","Iron Jugulis","Iron Moth","Iron Thorns","Frigibax","Arctibax","Baxcalibur","Gimmighoul","Gholdengo","Wo-Chien","Chien-Pao","Ting-Lu","Chi-Yu","Roaring Moon","Iron Valiant","Koraidon","Miraidon","Walking Wake","Iron Leaves","Dipplin","Poltchageist","Sinistcha","Okidogi","Munkidori","Fezandipiti","Ogerpon","Archaludon","Hydrapple","Gouging Fire","Raging Bolt","Iron Boulder","Iron Crown","Terapagos","Pecharunt");
        pokemon.stream().map(String::toLowerCase).filter(x->x.startsWith("b")).forEach(System.out::println);

        System.out.println("sum with reduce function : ");
        double total = Stream.of(9.10,108.59,15.55,17.90).reduce(0.0,(Double a, Double b) -> a+b);
        System.out.println("Total = " +total);

        System.out.println("Summary Statistics: ");
        IntSummaryStatistics intSummaryStatistics = IntStream.of(9,18,25,29,27,15,45,300).summaryStatistics();
        System.out.println(intSummaryStatistics);


        List<Integer> list1 = new ArrayList<>();
        for (int i = 10; i <=20 ; i++)
            list1.add(i);
        Stream<Integer> intStream = list1.stream();
        System.out.println("List: " +list1);
        Stream<Integer> sliceOfIntStream =  getSliceOfStream(intStream, 5,10);
        System.out.println("\nSlice Of Stream: ");
        sliceOfIntStream.forEach(System.out::println);

String str = "Pokemon";
List<Character> characters = convertStringToCharList(str);
        System.out.println(characters);
        Set<Character> characters1 = convertStringToCharListAndRemoveDuplicates(str);
        System.out.println(characters1);

Stream<String> stream1 = Stream.of("Pokemon");
Stream<String> stream2 = Stream.of("Gotta catch 'em all");;
Stream.concat(stream1,stream2).forEach(System.out::println);

        System.out.println("Convert to Long Stream");
        pokemons.stream().map(Pokemon::getSpecialAttack).mapToLong(n->Long.parseLong(String.valueOf(n))).
        forEach(System.out::println);

        System.out.println("Returning the number of one bits in binary representation of string length");
        pokemons.stream().map(Pokemon::getName).mapToLong(s->Long.bitCount(s.length())).
                forEach(System.out::println);

        LongStream longStream = LongStream.generate(() ->{return (long) (Math.random() * 1000);});
        longStream.limit(7).forEach(System.out::println);

        System.out.println("Long Summary Statistics");
        LongStream longStream1 = LongStream.range(100,200);
        LongSummaryStatistics longSummaryStatistics = longStream1.summaryStatistics();
        System.out.println(longSummaryStatistics);

        System.out.println("Double Summary Statistics");
        DoubleStream doubleStream = DoubleStream.of(200.00,300.00,500.00,434.54,876.98,344.54);
        DoubleSummaryStatistics doubleSummaryStatistics = doubleStream.summaryStatistics();
        System.out.println(doubleSummaryStatistics);

        System.out.println("---For Each Orderd------");
List<Integer> list2 = Arrays.asList(10,9,7,5,12,9,15,20);
        list2.stream().forEachOrdered(System.out::println);

        List<Integer> list3 = Arrays.asList(11,12,15,17,19,20);

        Stream<List<Integer>> s1 = Stream.of(list2);
        Stream<List<Integer>> s2 = Stream.of(list3);

        System.out.println("-----Concatenate Two Stream--------");
        Stream.concat(s1,s2).distinct().forEach(ele-> System.out.println(ele));

        System.out.println("---Collections.groupingBy------");
        Map<Integer,Long> result = list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

        Map<Integer, List<Pokemon>> pokeNameByAsc = pokemons.stream().collect(Collectors.groupingBy(Pokemon::getHp));
        System.out.println(pokeNameByAsc);

DoubleStream doubleStream1 = DoubleStream.of(21.009,12.009,24.88,33.55);

        DoubleStream doubleStream2 = DoubleStream.of(31.009,41.009,23.88,55.55,21.009);

        DoubleStream.concat(doubleStream1,doubleStream2).distinct().forEach(ele-> System.out.println(ele));

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Bulbasaur");
        listOfStrings.add("Charmander");
        listOfStrings.add("Venasaur");
        listOfStrings.add("Charizard");

        Map<Integer, List<String>> result2 = listOfStrings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result2);

      List<Employee> highestSalary = (List<Employee>) employees.stream()
              .sorted((w1,w2) -> w2.getSalary()- w1.getSalary()).limit(1).collect(Collectors.toList());
        System.out.println(highestSalary);

        List<Pokemon> highestHp = pokemons.stream().sorted((o1,o2) ->o2.getHp()-o1.getHp())
                .limit(1).collect(Collectors.toList());
        System.out.println(highestHp);


       IntSummaryStatistics intSummaryStatistics1 = pokemons.stream().map(Pokemon::getHp).filter(i-> i>10).mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(intSummaryStatistics1.getAverage());
        System.out.println(intSummaryStatistics1.getCount());

        System.out.println("------ filter name using starts with---------- ");
        pokemons.stream().map(Pokemon::getName).filter(i->i.startsWith("P")).forEach(System.out::println);

        System.out.println("------ filter name using ends with---------- ");
        pokemons.stream().map(Pokemon::getName).filter(i->i.endsWith("e")).forEach(System.out::println);

        System.out.println("------ filter name using contains---------- ");
        pokemons.stream().map(Pokemon::getName).filter(i->i.contains("A")).forEach(System.out::println);

        System.out.println("------ filter Distinct HP---------- ");
        pokemons.stream().map(Pokemon::getHp).distinct().forEach(System.out::println);
    }
    }
