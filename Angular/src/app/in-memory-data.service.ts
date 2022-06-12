import { InMemoryDbService } from "angular-in-memory-web-api";
import { Note } from "./note";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root"
})
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const notes = [
      { id: 11, text: "hahaha1", date: new Date() },
      { id: 12, text: "hahaha2", date: new Date() },
      { id: 13, text: "hahaha3", date: new Date() },
      { id: 14, text: "hahaha4", date: new Date() },
      { id: 15, text: "hahaha5", date: new Date() },
      { id: 16, text: "hahaha6", date: new Date() }
    ];
    return { notes };
  }
  genId(notes: Note[]): number {
    return notes.length > 0
      ? Math.max(...notes.map((note) => note.id)) + 1
      : 11;
  }
}
