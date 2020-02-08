package com.epamtask.com.epamtask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.out.println( "New year's Gifts!\n" );
        
    	Thread.sleep(2000);
    
        Child shiva = new Child("shiva");
        Child kiran = new Child("kiran");

        System.out.println( "Created two children shiva and kiran.\n" );
        
        shiva.addChocolate(new Chocolate(50,150,"Red"));
        shiva.addChocolate(new Chocolate(5,50,"Blue"));
        shiva.addChocolate(new Chocolate(100,500,"Yellow"));
        
        kiran.addChocolate(new Chocolate(200,190,"Green"));
        kiran.addChocolate(new Chocolate(45,90,"Pink"));
        kiran.addChocolate(new Chocolate(160,40,"Brown"));
        
        shiva.addSweet(new Sweet(23,95,"lemon"));
        shiva.addSweet(new Sweet(63,85,"orange"));
        shiva.addSweet(new Sweet(33,34,"apple"));

        kiran.addSweet(new Sweet(35,68,"berry"));
        kiran.addSweet(new Sweet(46,95,"rose"));
        kiran.addSweet(new Sweet(13,85,"mango"));
        
        
        System.out.println( "Giving 3 chocolates and 3 candies to shiva and kiran each...\n" );
        Thread.sleep(2000);
        
        System.out.println( "Done." );

        System.out.println( "\nshiva Sweets-\n" );
        Thread.sleep(500);
        for(Sweet sweet:shiva.getSweets()) {
            System.out.println( sweet.getName()+" of weight "+sweet.getWeight()+"g having sweetness "+sweet.getSweetness() );
        }
        
        System.out.println( "\nshiva Chocolates-\n" );
        Thread.sleep(500);
        for(Chocolate chocolate:shiva.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println( "\nkiran Sweets-\n" );
        Thread.sleep(500);
        for(Sweet sweet:kiran.getSweets()) {
            System.out.println( sweet.getName()+" of weight "+sweet.getWeight()+"g having sweetness "+sweet.getSweetness() );
        }
        
        System.out.println( "\nkiran Chocolates-\n" );
        Thread.sleep(500);
        for(Chocolate chocolate:kiran.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        
        System.out.println("Calculating total weight of chocolates...\n");
        Thread.sleep(2000);
        
        System.out.println("shiva has "+ shiva.getTotalGiftWeight() +" grams of gifts in total.");
        System.out.println("kiran has "+ kiran.getTotalGiftWeight() +" grams of gifts in total.");
        
        System.out.println("\nkiran wants to sort his Chocolates by sweetness...\n");
        Thread.sleep(2000);
        
        System.out.println("Done.");
        
        kiran.sortChocolatesBySweetness();
        
        System.out.println( "\nkiran Chocolates-" );
        for(Chocolate chocolate:kiran.getChocolates()) {
            System.out.println( chocolate.getName()+" of weight "+chocolate.getWeight()+"g having sweetness "+chocolate.getSweetness() );
        }
        System.out.println( "\nshiva wants to find lemon in her sweets-" );
        Thread.sleep(2000);
        System.out.println( shiva.findSweetInSweets("lemon")?"Found":"Not Found" ); 
        System.out.println( "\nshiva wants to find mango in her sweets-" );
        Thread.sleep(1000);
        System.out.println( shiva.findSweetInSweets("mango")?"Found":"Not Found" );
        System.out.println( "\nshiva wants to find apple in her sweets-" );
        Thread.sleep(3000);
        System.out.println( shiva.findSweetInSweets("apple")?"Found":"Not Found" );
    }
}
