package Workout;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;
import java.util.HashSet;
import java.util.Set;

public class WorkoutSpeechRequestStreamHandler extends SpeechletRequestStreamHandler {
	 private static final Set<String> supportedApplicationIds = new HashSet<String>();
	    static {
	        /*
	         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
	         * Alexa Skill and put the relevant Application Ids in this Set.
	         */
	        supportedApplicationIds.add("amzn1.ask.skill.19da16f5-de7b-4085-b5eb-3ca673ddc4ad");
	    }
	
	    public WorkoutSpeechRequestStreamHandler() {
		super(new WorkoutSpeechlet(), supportedApplicationIds);
		// TODO Auto-generated constructor stub
	}

}
