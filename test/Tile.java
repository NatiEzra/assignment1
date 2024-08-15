package test;
import java.util.Random;
public class Tile {

	public final char letter;
    public final int value;
    private Tile (char _letter, int _value)
    {
        this.letter=_letter;
        this.value=_value;
    }
    public static Tile createTile(char letter, int score) {
        return new Tile(letter, score);
    }

    public class Bag{
        public final int[] Letters ;
        public final Tile[] Tiles ;
        public Bag(){
            Tile.createTile('x', 0);
            this.Tiles = new Tile[26];
            int[] letters=new int[]{9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
            this.Letters=letters;
            this.Tiles[0]=createTile('A',1);
            this.Tiles[1]=createTile('B',3);
            this.Tiles[2]=createTile('C',3);
            this.Tiles[3]=createTile('D',2);
            this.Tiles[4]=createTile('E',1);
            this.Tiles[5]=createTile('F',4);
            this.Tiles[6]=createTile('G',2);
            this.Tiles[7]=createTile('H',4);
            this.Tiles[8]=createTile('I',1);
            this.Tiles[9]=createTile('J',8);
            this.Tiles[10]=createTile('K',5);
            this.Tiles[11]=createTile('L',1);
            this.Tiles[12]=createTile('M',3);
            this.Tiles[13]=createTile('N',1);
            this.Tiles[14]=createTile('O',1);
            this.Tiles[15]=createTile('P',3);
            this.Tiles[16]=createTile('Q',10);
            this.Tiles[17]=createTile('R',1);
            this.Tiles[18]=createTile('S',1);
            this.Tiles[19]=createTile('T',1);
            this.Tiles[20]=createTile('U',1);
            this.Tiles[21]=createTile('V',4);
            this.Tiles[22]=createTile('W',4);
            this.Tiles[23]=createTile('X',8);
            this.Tiles[24]=createTile('Y',4);
            this.Tiles[25]=createTile('Z',10);
        }
        public static Bag getBag() 
        {
            Bag bag=new Bag();
           
            return bag;

        }
        public Tile getFromBag() {
            Random random=new Random();
            int randomInt=random.nextInt(97);
            int i=0;
            while(randomInt>0)
            {
                randomInt-=this.Letters[i];
                i++;
            }
            return this.Tiles[i];
            }
    }
}


