import { Service } from '@angular/core';

@Service()
export class EventsService {
  #events: Event[] = [];

  getAllEvents() {
    return this.#events;
  }


}
