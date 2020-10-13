package chengdu.jiafa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ChannelServer {
	private List<Channel> channels = new ArrayList<>();
	private ChannelServer() {
		for(int i=1;i<=10;i++) {
			Channel c = new Channel();
			c.setId(i);
			c.setQuality("高清");
			c.setTitle("点点电视节目"+i);
			c.setUrl("http:jiafa.com");
			channels.add(c);
		}
	}
	
	public List<Channel> getAllChannels(){
		return this.channels;
	}
	
	public Channel getChannel(int id) {
		Channel result = null;
		for(Channel c : this.channels) {
			if(id == c.getId()) {
				result =c;
				break;
			}
		}
		return result;
	}

}
