/**
 * Class Queue
 *
 * @author Anggito Anju
 * @version 1.0 - 7 Mei 21
 */


public class Queue
{
    int size = 0;
    NodeQueue head, tail;
    
    //Constructur Queue
    public Queue() {
        head = tail = null;
    }

    //Masukkan data baru pada queue
    public void enqueue(String name, String need) {
        //Alokasi memori node baru
        NodeQueue newNode = new NodeQueue();

        //Assign data ke node baru
        newNode.nama = name;
        newNode.keperluanNasabah = need;
        newNode.next = null;

        //Jika Queue masih kosong
        if(head == null) {
            head = tail = newNode;
        }
        //Jika ada isi, assign ke selanjutnya
        else {
            tail.next = newNode;
            tail = newNode;
        }

        //Tambahkan size queue
        size++;
    }

    //Menghapus data pada queue
    public void dequeue() {
        //Jika queue kosong
        if(head == null) {
            System.out.println("Antrian Kosong!");
        }
        else {
            head = head.next;
            size--;
        }
    }

    //Return size dari queue
    public int queue_size() {
        return size;
    }

    //Melihat queue
    public void queue_view() {
        //Jika kosong
        if(size == 0) {
            System.out.println("Antrian Kosong!");
        }
        else {
            NodeQueue tempNode = head;
            //print sebanyak isi queue
            System.out.println("Nomor\t||  Nama\t||  Keperluan\t||");
            for(int i = 1; i<=size; i++) {
                if(tempNode != null) {
                    System.out.println(+(i)+".\t||"+(tempNode.nama)+"\t||" +(tempNode.keperluanNasabah)+"\t||");
                    tempNode = tempNode.next;
                }
            }
        }
    }
}
