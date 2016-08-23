package test4;

public class Test {
	public static void main(String[] args){
		 String str = "APPLE";
         switch (Enum.compare(str)) {
                case APPLE:
                       System.out.println("apple");
                       break;
                case BANANA:
                       System.out.println("banana");
                       break;
                case BREAD:
                       System.out.println("bread");
                       break;
                default:
                       System.out.println("novalue");
         }
	}
	
	public enum Enum {
        APPLE, BANANA, BREAD, NOVALUE;
        public static Enum compare(String str) {
               try {
                      return valueOf(str.toUpperCase());
               } catch (Exception ex) {
                      return NOVALUE;
               }
        }
	}
}
