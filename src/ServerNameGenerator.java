public class ServerNameGenerator {
    private static String[] adj = {"radical","tubular","gnarly","wicked","groovy"};
    private static String[] noun = {"wombat","potoroo","kangaroo","koala","bandicoot"};

    private static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String makeServerName (String[] arr1, String[] arr2) {
        String adj = randomElement(arr1);
        String noun = randomElement(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Your new server name is:");
        System.out.println(makeServerName(adj,noun));
    }
}
