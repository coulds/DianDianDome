package chengdu.jiafa;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/channel")
public class ChannelController {	
	@Autowired
	private ChannelServer service;
	
	@GetMapping
	public List<Channel> getAllChannels() {
		return service.getAllChannels();
	}
	
	@GetMapping("/{id}")
	public Channel getChannel(@PathVariable int id) {
		return service.getChannel(id);
	}

}
