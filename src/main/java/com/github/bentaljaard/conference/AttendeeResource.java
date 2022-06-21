package com.github.bentaljaard.conference;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.bentaljaard.conference.models.Attendee;

@Path("/api/attendee")
public class AttendeeResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Attendee> getAttendees(){

        return Attendee.listAll();
    }

    @POST
    @Transactional
    public Attendee addAttendee(Attendee attendee){
        attendee.persist();
        return attendee;
    }

    @GET
    @Path("/{attendeeId}")
    public Attendee getAttendee(String id){
        return Attendee.findById(id);
    }

    

}
