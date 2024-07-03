package fr.isri.master.producer;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.Stores;

import io.quarkus.kafka.client.serialization.ObjectMapperSerde;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class TopologyProducer {
    static final String CELSIUS_STORE = "celsius-store";

    @Produces
    public Topology buildTopology() {
        StreamsBuilder builder = new StreamsBuilder();

        ObjectMapperSerde<Double> randomCelsiusSerde = new ObjectMapperSerde<>(Double.class);
        KeyValueBytesStoreSupplier celsius_s = Stores.persistentKeyValueStore(WEATHER_STATIONS_STORE);


        return builder.build();
    }
}
