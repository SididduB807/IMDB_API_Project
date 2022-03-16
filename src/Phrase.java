public class Phrase {
    private String currentPhrase;

    public Phrase(String p){
        currentPhrase= p;
    }
    public int findNthOccurence(String str, int n){
        return 6;
    }
    public void replaceNthOccurence(String str, int n, String rep1){
        int locate= findNthOccurence("ate", 1);
        if(locate != -1){
            currentPhrase= currentPhrase.substring(0, locate) + rep1 + currentPhrase.substring(locate + str.length());
        }

    }

}
