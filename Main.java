import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    // here we declared the object for both local and anonymous classes
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args)
    {

//        Gearbox mclaren = new Gearbox(6);
//        mclaren.addGear(1, 5.3);
//        mclaren.addGear(2, 10.6);
//        mclaren.addGear(3,10.9);
//        mclaren.operateClutch(true);
//        mclaren.changeGear(1);
//        mclaren.operateClutch(false);
//        System.out.println(mclaren.wheelSpeed(2000));
//        mclaren.changeGear(2);
//        System.out.println(mclaren.wheelSpeed(3000));

        // this is a local class
//        class ClickListener implements Button.OnClickListener
//        {
//            public ClickListener()
//            {
//                System.out.println("I have been attached!");
//            }
//
//            @Override
//            public void onClick(String title)
//            {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());
        // this is an anonymous class (has no name)
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was pressed");
            }
        });
        listen();
    }

    private static void listen()
    {
        boolean quit = false;
        while(!quit)
        {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
