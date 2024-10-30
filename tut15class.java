public class tut15class {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Tarun");
        System.out.println(sc);

        //Character at index:-
        System.out.println(sc.charAt(1));

        //Replace at character at index:-
        sc.setCharAt(1, 'P');
        System.out.println(sc);

        //Insert new character :-
        sc.insert(0, 'M');
        System.out.println(sc);

        //Delete a character :-

        sc.delete(0, 1);
        System.out.println(sc);

        
    }
}
