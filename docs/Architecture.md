# VimaxOS Architecture

## Core flow

```text
Conversation
    -> Intent
    -> Context
    -> Planner
    -> Policy / Trust
    -> Action
    -> Module
    -> Event
    -> Memory / Sync
```

## Platform principle

Products are not isolated applications. `Nail`, `Pure`, `Home`, `Sound` and `Sport` are organs of one Vimax platform.

Each organ owns its domain logic, but reuses:

- identity;
- roles;
- trust;
- events;
- synchronization;
- notifications;
- audit history;
- capability contracts.

## First integration

`Vimax.Nail` is the first two-sided organ:

```text
Client intent
    -> appointment request
    -> Vimax identity and trust
    -> synchronized Nail state
    -> Master decision
    -> synchronized result
```
