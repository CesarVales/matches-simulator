package data;

import com.example.matchessimulator.match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {
    @GET("matches.json")
    Call<List<match>> getMatches();
}
