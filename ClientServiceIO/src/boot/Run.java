package boot;

import java.net.URISyntaxException;

import io.socket.emitter.Emitter;
import io.socket.engineio.client.Socket;

public class Run {

	public static  void main(String args[]) throws URISyntaxException {


		Socket socket = new Socket("localhost:8888");
		socket.on(Socket.EVENT_OPEN, new Emitter.Listener() {
		  @Override
		  public void call(Object... args) {
		    socket.send("hi");
		    socket.close();
		  }
		});
		socket.open();
	}
}
