public class ObserverPatternEx {

    public static void main(String[] args) {

        System.out.println("^^^^ ObserverPattern Demo \n");



        Observer o1 = new Observer();
        
        SubjectImpl sub1 = new SubjectImpl();

        sub1.register(o1);

        System.out.println( "Setting Flag = 5" );
        
        sub1.setFlag(5);
        
        System.out.println( "Setting Flag = 25" );
        
        sub1.setFlag(25);

        sub1.unregister(o1);

        // no notifly this time , unregister ! 

        sub1.setFlag(59);

        


    }

}