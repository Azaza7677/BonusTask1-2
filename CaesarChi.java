public class CaesarChi extends Chi {

    public CaesarChi(int shift){
        this.shift=shift;
    }
    public String enqrypt(String text){
        String result ="";
        for(char c:text.toCharArray()){
            if(Character.isLetter(c)){
                char first=Character.isUpperCase(c)? 'A':'a';
                result+=(char)((c-first+shift)%26+first);
            }else {
                result+=c;
            }
        }
        return result;
    }
    public String decrypt(String text){
        String result="";
        for (char c:text.toCharArray()){
            if (Character.isLetter(c)){
                char first=Character.isUpperCase(c)?'A':'a';
                result+=(char)((c-first-shift+26)%26+first);
            }else {
                result+=c;
            }
        }
        return result;
    }
}



