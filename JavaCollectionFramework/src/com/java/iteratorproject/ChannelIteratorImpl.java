package com.java.iteratorproject;

import java.util.List;

// custom iterator class
public class ChannelIteratorImpl implements ChannelIterator {

	private ChannelTypeEnum type;
	private List<Channel> channelsList;
	// variable to use for iterator
	private int position;//initial value of position=0 

	// data coming from ChannelCollection iterator(-) method
	public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelsList) {
		this.type = type;
		this.channelsList = channelsList;
		//System.out.println(position);
	}

	@Override
	public boolean hasNext() {
		while (position < channelsList.size()) {
			Channel c = channelsList.get(position);
			if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
				return true;
			} else
				position++;
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channelsList.get(position);
		position++;
		return c;
	}

}
