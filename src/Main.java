public class Main {
    public static void main(String[] args) {


        System.out.println(skip("babsdababadab"));
        System.out.println(skipString("babapplesdababappadab"));
        System.out.println(skipapp("babapplesdababappadab"));
    }


    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch=='a'){
         skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }


    static String skip(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch = up.charAt(0);

        if(ch=='a'){
         return skip(up.substring(1));
        }
        else{
            return ch + skip( up.substring(1));
        }
    }


    static String skipString(String up){
        if(up.isEmpty()){

            return "";
        }


        if(up.startsWith("apple")){
         return skipString(up.substring(5));
        }
        else{
            return up.charAt(0) + skipString( up.substring(1));
        }
    }


    static String skipapp(String up){
        if(up.isEmpty()){

            return "";
        }


        if(up.startsWith("app") && (!up.startsWith("apple"))){
         return skipapp(up.substring(5));
        }
        else{
            return up.charAt(0) + skipapp( up.substring(1));
        }
    }
}