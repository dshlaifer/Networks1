
/**
 * Write a description of class NetworkTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NetworkTest
{
    public static void main(String[] args)
    {
        
        NewsFeed feed = new NewsFeed();

        
        MessagePost message1 = new MessagePost("Alice", "Hello, this is my first post!");
        MessagePost message2 = new MessagePost("Bob", "Enjoying learning Java.");

        
        PhotoPost photo1 = new PhotoPost("Charlie", "holiday.jpg", "On vacation!");
        PhotoPost photo2 = new PhotoPost("Dana", "dog.png", "My dog at the park");

        
        feed.addMessagePost(message1);
        feed.addMessagePost(message2);
        feed.addPhotoPost(photo1);
        feed.addPhotoPost(photo2);

        
        feed.show();
    }
}
