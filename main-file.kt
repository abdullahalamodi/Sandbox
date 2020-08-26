class TypeIntro {

    fun main(args: Array<String>) {
        var expiriencePoints:Int = 5;
        val playerName:String = "Estragon";
        var hasSteed:Boolean = false;
        
        expiriencePoints += 5;
        println("expiriencePoints : "+expiriencePoints);
        println("playerName : "+playerName);
        magicMirror(playerName);


    }

    fun magicMirror (name:String){
        println("magicMirror : "+ name.reversed());
    }
    
}