# Vimax.Nail Organ

`Vimax.Nail` is not a standalone universe. It is an organ of VimaxOS.

## Modes

- Client
- Master

One Vimax identity may use both modes.

## Shared workflow

```text
Client requests appointment
    -> synchronized Appointment
    -> Master receives request
    -> Master confirms, proposes a new time or cancels
    -> Client receives the changed state
```

## Required shared services

- Vimax identity
- roles and trust
- event bus
- synchronization
- notifications
- audit history

## GEM1 preserved experience

The first local master-only application proved useful domain entities, but failed to represent the complete value path. That experience is retained; it is not treated as wasted work.
