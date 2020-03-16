package com.java.iteratorproject;

import java.util.ArrayList;
import java.util.List;

// Custom collection class
public class ChannelCollectionImpl implements ChannelCollection {

	
	private List<Channel> channelsList;
	
	public ChannelCollectionImpl() {
		channelsList = new ArrayList<Channel>();
	}
	
	@Override
	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	
	// type coming from ChannelTypeEnum
	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, channelsList);
	}
}
