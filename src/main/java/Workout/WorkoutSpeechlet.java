package Workout;
import java.util.ArrayList;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WorkoutSpeechlet implements Speechlet {
	 private static final Logger log = LoggerFactory.getLogger(WorkoutSpeechlet.class);
	
	private SpeechletResponse getWorkout() {
		// TODO Auto-generated method stub
		ArrayList<String> workoutList = new ArrayList<String>(12);
		
		workoutList.add("100 BURPEES");
		workoutList.add("100 PUSHUPS");
		workoutList.add("100 SITUPS");
		workoutList.add("100 TOE TOUCHES");
		workoutList.add("100 LUNGES");
		workoutList.add("100 SQUATS");
		workoutList.add("100 DIPS");
		workoutList.add("500 MTN CLIMB");
		workoutList.add("10 MINS PLANKS");
		workoutList.add("10 MINS FRONT/SIDE PLANKS");
		workoutList.add("10 MINS WALL SITS");
		workoutList.add("JUST STAIRS TODAY"); 
		String speechText = workoutList.get(getIndex(workoutList));
		
		SimpleCard card = new SimpleCard();
        card.setTitle("HelloWorld");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech,card);
		
		

	}
	
	public static int getIndex(ArrayList<String> listing) {
		return (int) (Math.random() * listing.size());
		
		
	}
	

	public SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
		// TODO Auto-generated method stub
        log.info("onLaunch requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId()); 
		
		return getWorkout();
	}

	public SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
	        log.info("onIntent requestId={}, sessionId={}", request.getRequestId(),
	                session.getSessionId());		
	        
	        throw new SpeechletException("No intents registred, try launch request");
	}

	public void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {
		log.info("onSessionEnded requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
		
	}

	public void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {

        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
		// TODO Auto-generated method stub
		
	}
}
