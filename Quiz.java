public static String scrambleWord(String word){
  /* To be implemented in part (a) */
for(int i=0; i<word.length()-1; i++)
{
  //if the letter at num i is A and the letter at num i+1 isnt A
  if(word.Substring(i,1).equals("A") && !word.Substring(i+1,1).equals("A"))
    {
      //swap places
      word.Substring(i,1)=word.Substring(i+1,1);
      word.Substring(i+1,1)="A";
    }
  //if, if statement failed go to next letter
  else i+1;
}
return word;
}

public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  for(int i=0; i<wordList.size(); i++)
  {
    //if the scrambled word at i is the same as the regular word at i
    if(scrambleWord(i).equals(wordList.get(i)))
    //then remove it
      wordList.remove(i);
    else 
    {
      //otherwise its good for sure and swap them out
      wordList.remove(i);
      wordList.add(scrambleWord(i));
    }
  }
}
