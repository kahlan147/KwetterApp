package main.webapp.backend.classes;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Niels Verheijen on 11/02/2019.
 */
public class Post {

    public UUID Id;
    public String Text;
    public Date Date;
    public Time time;
    public boolean IsReaction;
    public User Poster;
    public List<Post> Reactions;
}
