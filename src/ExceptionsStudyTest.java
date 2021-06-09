public class ExceptionsStudyTest {
    public static void main(String[] args) {

//        try {
//            ExceptionsStudy study = new ExceptionsStudy();
//            System.out.println(Integer.parseInt(study.mightBeAnInteger));
//            System.out.println(Integer.parseInt(study.definitelyNotAnInteger));
//        } catch (NumberFormatException ex) {
////            System.out.println("thats an exception my friend. not an integer");
////            System.out.println("I got an exception: " + ex);
////            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }

        ExceptionsStudy study = new ExceptionsStudy();
//        study.askForAnInteger();
        study.aMoreComplexAskForInteger();

    }
}
