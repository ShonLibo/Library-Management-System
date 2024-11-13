package ApprovalPackage;

public class Approval {


    public static boolean BookIdValid(int BookId){

        return BookId ==11 ;
    }

    public static boolean VisitorNameValid(String name) {
        return name != null && !name.isEmpty();
    }

}
