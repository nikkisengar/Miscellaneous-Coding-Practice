package com.java.iteratorproject;

public class IteratorPatternTest {

	public static void main(String[] args) {
		
		// adding the Channels to the custom collection
		IChannelCollection channelCollection = populateChannels();
		
		// iterating over the custom collection using custom iterator
		IChannelIterator baseIterator = channelCollection.iterator(ChannelTypeEnum.ALL);
		while(baseIterator.hasNext()) {
			Channel c=baseIterator.next();
			System.out.println(c.toString());
		}
		
		System.out.println("***************************************");
		
		// Channel Type Iterator
		IChannelIterator englisIterator = channelCollection.iterator(ChannelTypeEnum.ENGLISH);
		while(englisIterator.hasNext()) {
			Channel c=englisIterator.next();
			System.out.println(c.toString());
		}
	}

	public static IChannelCollection populateChannels() {

		IChannelCollection channelCollection = new ChannelCollectionImpl();
		
		channelCollection.addChannel(new Channel(98.3, ChannelTypeEnum.TELUGU));
		channelCollection.addChannel(new Channel(94.3, ChannelTypeEnum.HINDI));
		channelCollection.addChannel(new Channel(93.4, ChannelTypeEnum.TAMIL));
		channelCollection.addChannel(new Channel(100.5, ChannelTypeEnum.MARATHI));
		channelCollection.addChannel(new Channel(101.3, ChannelTypeEnum.ENGLISH));
		channelCollection.addChannel(new Channel(102.0, ChannelTypeEnum.HINDI));
		channelCollection.addChannel(new Channel(103.7, ChannelTypeEnum.TELUGU));
		channelCollection.addChannel(new Channel(104.0, ChannelTypeEnum.TAMIL));
		channelCollection.addChannel(new Channel(96.5, ChannelTypeEnum.ENGLISH));
		channelCollection.addChannel(new Channel(92.3, ChannelTypeEnum.MARATHI));
		return channelCollection;

	}
}
