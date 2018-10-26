public class driver{
	public static void main(String[] args){
    SuperArray beef = new SuperArray();

    beef.add( "1");
    beef.add( "2");
    beef.add( "3");
    beef.add( "4");
    beef.add( "5");
    beef.add( "6");
    beef.add( "7");
    beef.add( "8");
    beef.add( "9");
    beef.add( "10");

    System.out.println(beef);
    System.out.println( "\n" );
    beef.add( "11");

    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );

    beef.add( "12");
    beef.add( "13");
    beef.add( "14");
    beef.add( "15");
    beef.add( "16");
    beef.add( "17");
    beef.add( "18");
    beef.add( "19");
    beef.add( "20");

    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );

    beef.add( "21");

    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );

    System.out.println(beef.indexOf( "21"));
    System.out.println( "should be 20" );
    System.out.println(beef.lastIndexOf( "21"));
    System.out.println( "should be 20" );

    System.out.println( "\n" );

    System.out.println(beef.lastIndexOf( "1"));
    System.out.println( "should be 0" );

    System.out.println( "\n" );
    beef.add(2,"22");

    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );
    beef.add(22,"23");

    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );
    beef.add(25,"23");

    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );
    beef.remove(3);
    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );
    beef.remove(25);
    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );
    beef.remove(7);
    System.out.println(beef.size());
    System.out.println(beef);


    System.out.println( "\n" );
    System.out.println(beef.remove("12"));
    System.out.print("before removal \n");
    beef.remove("12");
    System.out.println(beef.remove("12"));
      System.out.print("after removal \n");
    System.out.println(beef.size());
    System.out.println(beef);

    System.out.println( "\n" );
    beef.remove("52");
		System.out.println(beef.remove("52"));
    System.out.println(beef.size());
    System.out.println(beef);

		beef.add("24");
		beef.add("24");
		beef.add("24");
		beef.add("24");
		System.out.println(beef);

		System.out.println(beef.indexOf( "24"));
		System.out.println(beef.lastIndexOf( "24"));
  }
  }
