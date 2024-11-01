
// class Alien
// {
//     private final int id;
//     private final String name;
   
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(java.lang.Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

// }

record Alien (int id, String name) {
    public Alien(int id, String name)
    {
        if(id==0)
            throw new IllegalArgumentException("id cannot be zero")
        this.id = id;
        this.name = name;
    }
}

public class RecordClass {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Mambet");
        Alien a2 = new Alien(1, "Mambet");
        Alien a3 = new Alien(0, "Mambet");

        System.out.println(a1.equals(a2));
        System.out.println(a1);
        // System.out.println(a1.getName());
    }
}