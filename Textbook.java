public class Textbook extends Book
  {
    private int edition;

    public int getEdition()
    {
      return edition;
    }

    public Textbook(String title, double price, int edition)
    {
      super(title, price);
      this.edition = edition;
    }

    public boolean canSubstituteFor(Textbook other)
    {
      if(getTitle().equals(other.getTitle()))
      {
        if(edition >= other.edition) return true;
      }
      return false;
    }

    public String getBookInfo()
    {
      return super.getBookInfo() + "-" + edition;
    }
  }
